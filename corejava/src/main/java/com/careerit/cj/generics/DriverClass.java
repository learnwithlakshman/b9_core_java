package com.careerit.cj.generics;

import java.io.IOException;
import java.util.Properties;

public class DriverClass {
	private static final Properties properties = new Properties();
	static {
		try {
			properties.load(DriverClass.class.getResourceAsStream("/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		GameService game = getGameService();
		System.out.println(game.gameName());
	}

	private static GameService getGameService() {
		// Property file
		String name = properties.getProperty("game.class");
		try {
			Class<?> cls = Class.forName(name);
			GameService gameService = (GameService) cls.newInstance();
			return gameService;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
