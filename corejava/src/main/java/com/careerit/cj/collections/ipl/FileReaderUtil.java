package com.careerit.cj.collections.ipl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

		private static final String TEAM_FILE="/teams.csv";
	    private static final String PLAYER_FILE="/players.csv";
		public static List<Team> loadTeamDetails() throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(FileReaderUtil.class.getResourceAsStream(TEAM_FILE)));
			String line = null;
			List<Team> teamList = new ArrayList<>();
			while((line=br.readLine())!=null){
				String[] arr = line.split(",");
				int i = 0;
				String city  = arr[i++];
				String coach = arr[i++];
				String homeGround = arr[i++];
				String name = arr[i++];
				String label = arr[i++];
				Team team = Team.builder().name(name).city(city).coach(coach).homeGround(homeGround).label(label).build();
				teamList.add(team);
			}
			return teamList;
		}

	public static List<Player> loadPlayerDetails() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(FileReaderUtil.class.getResourceAsStream(PLAYER_FILE)));
		String line = null;
		List<Player> playersList = new ArrayList<>();
		while((line=br.readLine())!=null){
			String[] arr = line.split(",");
			int i = 0;

			String name = arr[i++];
			double amount = Double.parseDouble(arr[i++]);
			String role = arr[i++];
			String label = arr[i++];
			Player player = Player.builder().name(name).amount(amount).label(label).role(role).build();
			playersList.add(player);
		}
		return playersList;
	}
}
