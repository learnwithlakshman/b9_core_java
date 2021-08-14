package com.careerit.cj.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cj.ipl.domain.Player;
import com.careerit.cj.ipl.dto.RoleCountAmountDTO;
import com.careerit.cj.ipl.dto.TeamStatDTO;

public class IplStatDaoImpl implements IplStatDao {
	// select team,count(*) as count,sum(price) as total_amount from player group by
	// team;
	//
	// select distinct(team) from player;
	// select id,name,role,country,team,price from player where team="RCB";

	private static final String ROLE_COUNT_AMOUNT = "select role,count(*) as count,sum(price) as total_amount from player where team=? group by role";

	@Override
	public List<TeamStatDTO> selectTeamStats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleCountAmountDTO> selectRoleAndAmountStats(String team) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<RoleCountAmountDTO> list = new ArrayList<>();
		try {
			con = ConnectionUtil.getConnection();
			pst = con.prepareStatement(ROLE_COUNT_AMOUNT);
			pst.setString(1, team);
			rs = pst.executeQuery();
			while (rs.next()) {
				String role = rs.getString("role");
				int count = rs.getInt("count");
				double totalAmount = rs.getDouble("total_amount");
				RoleCountAmountDTO obj = RoleCountAmountDTO.builder().team(team).totalAmount(totalAmount).count(count)
						.role(role).build();
				list.add(obj);
			}
		} catch (SQLException e) {
			System.out.println("While getting role count and amount :" + e);
		} finally {
			ConnectionUtil.close(rs, pst, con);
		}
		return list;
	}

	@Override
	public List<String> selectTeamNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> selectPlayers(String team) {
		// TODO Auto-generated method stub
		return null;
	}

}
