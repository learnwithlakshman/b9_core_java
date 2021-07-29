package com.careerit.cj.oop;
public class IdGenerator {

	private static String prefix = "SB";
	private static long id = 1000000001;

	public static String getNewId() {
		return prefix + "" + id++;
	}
}