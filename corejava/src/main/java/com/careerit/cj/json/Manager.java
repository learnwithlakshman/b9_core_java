package com.careerit.cj.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Manager {

	public static void main(String[] args) {
			Player player = readObject("/player.json", Player.class);
			System.out.println(player);
	}

	private static <T> T readObject(String fileName, Class<T> cls) {
		ObjectMapper obj = new ObjectMapper();
		try {
			return obj.readValue(Manager.class.getResourceAsStream(fileName), cls);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
