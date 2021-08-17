package com.careerit.cj.ipl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import com.careerit.cj.ipl.dao.ConnectionUtil;
import com.careerit.cj.ipl.dao.IplStatDao;
import com.careerit.cj.ipl.dao.IplStatDaoImpl;
import com.careerit.cj.ipl.dto.RoleCountAmountDTO;

public class Manager {

	public static void main(String[] args) {

		IplStatDao obj = new IplStatDaoImpl();

		List<RoleCountAmountDTO> list = obj.selectRoleAndAmountStats("RCB");
		list.stream().forEach(ele -> {
			System.out.println(ele.getTeam() + " " + ele.getCount() + " " + ele.getRole() + " " + ele.getTotalAmount());
		});
		System.out.println("---------- Team names -----------------");
		obj.selectTeamNames().forEach(name -> {
			System.out.println(name);
		});

		System.out.println("---------- Players of the given team ------------");
		obj.selectPlayers("RCB").stream().forEach(System.out::println);
		System.out.println("----------------- Employeee ----------------------");
		show_dept_sal_stat("ACCOUNTING");

		// addDept();
		show_max_salary("ACCOUNTING");
	}
	private static void show_max_salary(String dname) {
		Connection con = null;
		CallableStatement st = null;

		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareCall("{call dept_max_sal(?,?)}");
			st.setString(1, dname);
			st.registerOutParameter(2, Types.DOUBLE);
			st.execute();
			double max_sal = st.getDouble(2);
			System.out.println("The max salary of " + dname + " is " + max_sal);
		} catch (SQLException e) {
			System.out.println("While getting dept details of " + dname + " " + e);
		} finally {
			ConnectionUtil.close(st, con);
		}
	}

	private static void show_dept_sal_stat(String dname) {

		String query = "select d.dname as dname,count(*) as count,min(e.sal) as min_sal,max(e.sal) as max_sal,sum(e.sal) as total_sal from emp e inner join dept d on e.deptno = d.deptno and d.dname=?";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(query);
			st.setString(1, dname);
			rs = st.executeQuery();
			while (rs.next()) {
				dname = rs.getString("dname");
				double minSalary = rs.getDouble("min_sal");
				int count = rs.getInt("count");
				double maxSalary = rs.getDouble("max_sal");
				double totalSalary = rs.getDouble("total_sal");
				System.out.println(dname + "\t" + count + "\t" + minSalary + "\t" + maxSalary + "\t" + totalSalary);

			}
		} catch (SQLException e) {
			System.out.println("While getting dept details of " + dname + " " + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}

	}

	private static void updateEmpSalary(double amount, int deptno) {
		String query = "update emp set sal=sal+? where deptno=?";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(query);

			con.setAutoCommit(false);
			//
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("While adding dept details " + e);
		} finally {
			try {
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.close(st, con);
		}
	}

	private static void addDept() {
		// 40 | OPERATIONS | BOSTON

		String query = "insert into dept(deptno,dname,loc) values(?,?,?)";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(query);
			st.setInt(1, 40);
			st.setString(2, "OPERATIONS");
			st.setString(3, "BOSTON");
			int count = st.executeUpdate();
			System.out.println("Total " + count + " dept(s) are updated/inserted");
		} catch (SQLException e) {
			System.out.println("While adding dept details " + e);
		} finally {
			ConnectionUtil.close(st, con);
		}

	}

}
