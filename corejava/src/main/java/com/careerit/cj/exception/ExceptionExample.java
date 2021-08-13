package com.careerit.cj.exception;

public class ExceptionExample {

	public static void main(String[] args) {

		String[] names = "Krish,Manoj,CHaran , Jayesh, Suresh, RamESH,CV, Kvs".split(",");

		for (String name : names) {
			try {
				name = name.trim().substring(0, 3).toUpperCase();
				System.out.println(name);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Name :" + name + " is too short" + e);
			}
		}

		System.out.println("End of main.....");
	}
}
