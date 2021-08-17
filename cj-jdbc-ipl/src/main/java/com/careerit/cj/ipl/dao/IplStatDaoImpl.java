package com.careerit.cj.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	private static final String SELECT_TEAM_NAMES = "select distinct(team) as team_name from player";
	private static final String SELECT_PLAYERS = "select id,name,role,country,price from player where team=?";

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
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<String> list = new ArrayList<>();
		try {
			con = ConnectionUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(SELECT_TEAM_NAMES);
			while (rs.next()) {
				String name = rs.getString("team_name");
				list.add(name);
			}
		} catch (SQLException e) {
			System.out.println("While getting team names :" + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}
		return list;
	}

	@Override
	public List<Player> selectPlayers(String team) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Player> list = new ArrayList<>();
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(SELECT_PLAYERS);
			st.setString(1, team);
			rs = st.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String role = rs.getString("role");
				String name = rs.getString("name");
				String country = rs.getString("country");
				double price = rs.getDouble("price");
				Player player = Player.builder().id(id).name(name).role(role).country(country).price(price).build();
				list.add(player);
			}
		} catch (SQLException e) {
			System.out.println("While getting players of "+ team +" " + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}
		return list;
	}

}
