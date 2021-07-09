package com.careerit.cj.loops;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		int res = 1;
		int i = 2;
		while(i<=num) {
			res *= i++;
		}
		System.out.println("Factorial of " + num + " is " + res);
		sc.close();
	}
}
