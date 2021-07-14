package com.careerit.cj.loops;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		printStars(num);
		printDigitsPattern(num);
		printSequencePattern();
	}
	
	private static void printSequencePattern() {
		
		int k = 1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
	}
	private static void printStars(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printDigitsPattern(int n) {
		for (int i = n; i >= 1; i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
}
