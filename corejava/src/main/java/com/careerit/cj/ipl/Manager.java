package com.careerit.cj.ipl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cj.collections.ipl.FileReaderUtil;
import com.careerit.cj.ipl.dao.ConnectionUtil;
import com.careerit.cj.ipl.dao.IplStatDao;
import com.careerit.cj.ipl.dao.IplStatDaoImpl;
import com.careerit.cj.ipl.domain.Player;
import com.careerit.cj.ipl.dto.RoleCountAmountDTO;

public class Manager {

	
	public static void main(String[] args) {
		
			IplStatDao obj = new IplStatDaoImpl();
			
			List<RoleCountAmountDTO> list = obj.selectRoleAndAmountStats("RCB");
			list.stream().forEach(ele->{
				System.out.println(ele.getTeam()+" "+ele.getCount()+" "+ele.getRole() +" "+ele.getTotalAmount());
			});
	}

	
	
	// To load data from csv
	
	private static final String ADD_PLAYER = "INSERT INTO player(name,role,country,team,price) VALUES(?,?,?,?,?)";
	private static void loadAndAddPlayers() {

		List<Player> list = loadPlayersFromCSV();
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = ConnectionUtil.getConnection();
			for (Player p : list) {
				st = con.prepareCall(ADD_PLAYER);
				st.setString(1, p.getName());
				st.setString(2, p.getRole());
				st.setString(3, p.getCountry());
				st.setString(4, p.getTeam());
				st.setDouble(5, p.getPrice());
				st.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println("While adding player :" + e);
		} finally {
			ConnectionUtil.close(st, con);
		}

	}

	public static List<Player> loadPlayersFromCSV() {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(FileReaderUtil.class.getResourceAsStream("/ipl_2020_data.csv")));
		String line = null;
		List<Player> playersList = new ArrayList<>();
		int heading = 0;
		try {
			while ((line = br.readLine()) != null) {
				
				if(heading == 0) {
					heading = 1;
					continue;
				}
				String[] arr = line.split(",");
				int i = 0;

				String name = arr[i++];
				String role = arr[i++];
				String country = arr[i++];
				String label = arr[i++];
				double amount = Double.parseDouble(arr[i++]);
				Player player = Player.builder().name(name).price(amount).team(label).role(role).country(country)
						.build();
				playersList.add(player);
			}
		} catch (IOException e) {
			System.out.println("While loading player information :" + e);
		}
		return playersList;
	}
}
