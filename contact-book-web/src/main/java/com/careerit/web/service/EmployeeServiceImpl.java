package com.careerit.web.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.web.domain.Employee;
import com.careerit.web.util.ConnectionUtil;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Page<Employee> getAllEmployees(int pageNum,int size) {
		
		Connection con = null;
		Statement st1 = null;
		Statement st2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		List<Employee> list = new ArrayList<>();
		Page<Employee> page = new Page<>();
		try {
			con = ConnectionUtil.getConnection();
			st1 = con.createStatement();
			st2 = con.createStatement();
			int start = pageNum * size + 1;
			int limit = size;
				
			rs1 =st1.executeQuery("select count(*) as count from employee");
			int total = 0;
			if(rs1.next()) {
				total =rs1.getInt("count");
				System.out.println("Total records :"+total);
			}
			rs1.close();
			st1.close();
			rs2 = st2.executeQuery("select id,name,email,gender,salary from employee limit "+limit+" offset "+(start-1));
			while(rs2.next()) {
				int id = rs2.getInt("id");
				String name = rs2.getString("name");
				String email = rs2.getString("email");
				String gender = rs2.getString("gender");
				float salary = rs2.getFloat("salary");
				Employee employee = new Employee(id, name, email, gender, salary);
				list.add(employee);
			}
			page.setData(list);
			page.setPage(pageNum);
			page.setTotal(total);
			page.setSize(size);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(rs2, st2, con);
		}
		return page;
	}

}
