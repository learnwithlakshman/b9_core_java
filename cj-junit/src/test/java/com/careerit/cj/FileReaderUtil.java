package com.careerit.cj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

	private static final String PLAYER_FILE = "/players.csv";

	public static List<Player> loadPlayerDetails() throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(FileReaderUtil.class.getResourceAsStream(PLAYER_FILE)));
		String line = null;
		List<Player> playersList = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(",");
			int i = 0;

			String name = arr[i++];
			double amount = Double.parseDouble(arr[i++]);
			String role = arr[i++];
			String label = arr[i++];
			Player player = Player.builder().name(name).price(amount).team(label).role(role).build();
			playersList.add(player);
		}
		return playersList;
	}
}
