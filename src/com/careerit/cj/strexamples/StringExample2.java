package com.careerit.cj.strexamples;

public class StringExample2 {

		public static void main(String[] args) {
			
			String s1 = "Core";
			String s2 = "Core";
			s1 = s1.concat(" Java");
			s2 = "Core Java";
			String s3 = "Core Java";
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			
			System.out.println(s2.equals("Core Java"));
			
			String s4 = s1 +" !";
			System.out.println(s4);
			
			
			
		}
}
