package com.careerit.cj.basics;

public class SwapOfTwoNumbers {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swap value of a = " + a + " and b = " + b);

		/*
		 * int t = a; a = b; b = t;
		 */
        a = a * b;
        b = a / b;
        a = a / b;
		
		System.out.println("After swap value of  a = " + a + " and b = " + b);

	}
}
