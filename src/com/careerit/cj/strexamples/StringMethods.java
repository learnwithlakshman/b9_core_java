package com.careerit.cj.strexamples;

public class StringMethods {

	public static void main(String[] args) {
		String data = "Rajesh, Charan , Kiran,  mahesh,  Jayesh,Manju ";
		String[] arr = data.split(",");

		for (String name : arr) {
			name = name.trim();
			if (name.toLowerCase().startsWith("m")) {
				System.out.println(name.substring(0, 3).toUpperCase());
			}
		}

	}
}
