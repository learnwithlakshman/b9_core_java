package com.careerit.cj.loops;

import java.util.Arrays;
import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		System.out.println("\nNo of factors :" + factors(num));
		boolean flag = isPrime(num);
		if (flag) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}

		int res = factorial(num);
		System.out.println("Factorial of :" + num + " is " + res);
		int[] arr= getPrimeNumbers(num);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static int[] getPrimeNumbers(int n) {
		int[] arr = new int[n];
		int c = 0;

		for (int i = 2;; i++) {
			if (isPrime(i)) {
				arr[c] = i;
				c++;
			}
			if (c == n) {
				break;
			}
		}
		return arr;
	}

	private static int primeCountInRange(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int factors(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	private static int factorial(int num) {
		int r = 1;
		for (int i = 2; i <= num; i++) {
			r *= i;
		}
		return r;
	}
}
