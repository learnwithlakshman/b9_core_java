package com.careerit.cj.oop.cbook;

import java.util.Arrays;

public class Manager {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		leftRotate(arr, 2,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void leftRotate(int arr[],int d, int n) {
		for (int l = 0; l < d; l++) {
			int i, temp;
			temp = arr[0];
			for (i = 0; i < n - 1; i++)
				arr[i] = arr[i + 1];
			arr[n - 1] = temp;
		}
	}

}