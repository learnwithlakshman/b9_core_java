package com.careerit.cj.strexamples;

public class StringExample1 {

		public static void main(String[] args) {
			String s1 = "Core";
			String s2 = "Core";
			String s3 = new String("Core");
			String s4 = new String("Core");
			System.out.println(s1 == s2);
			System.out.println(s3 == s4);
			System.out.println(s1.equals(s3));
			System.out.println(s3.equals(s4));
		}
}
