package com.careerit.cj.loops;

import java.util.Scanner;

public class SumOfSeries {

	// 1 + 1 / 2 ^ 2 + 1 / 3 ^ 2 + .... 1 / n ^ 2

	// 1 + 1 / 2 ! + 1 / 3 ! + 1 / n!
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n = sc.nextInt();
		double res = sum(n);
		System.out.println("The sum is :" + res);
		sc.close();

	}

	private static double sumOfFactorialSeries(int n) {
		double res = 1;
		for (int i = 2; i <= n; i++) {
			res = res + 1 / factorial(n);
		}
		return res;
	}

	private static double sum(int n) {
		double res = 1;
		for (int i = 2; i <= n; i++) {
			res = res + 1 / Math.pow(i, 2);
		}
		return res;
	}

	private static int factorial(int num) {
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}
}
