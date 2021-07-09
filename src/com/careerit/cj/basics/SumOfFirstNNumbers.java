package com.careerit.cj.basics;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int sum = (N * (N + 1)) / 2;
		System.out.println("The the sum of first " + N + " natural number is :" + sum);
		sc.close();
	}

}
