package com.careerit.cj.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("How many elements do you want to enter :");
				int n = sc.nextInt();
				int[] arr=new int[n];
				for(int i=0;i<n;i++) {
					System.out.println("Enter the "+(i+1)+" value :");
					arr[i] = sc.nextInt();
				}
				
				System.out.println(Arrays.toString(arr));
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
				System.out.println(arr[0]);
				System.out.println(arr[arr.length]);
				sc.close();
	}
}
