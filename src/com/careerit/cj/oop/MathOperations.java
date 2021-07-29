package com.careerit.cj.oop;

public class MathOperations {

	public int biggest(int a, int b) {
		return a > b ? a : b;

	}

	public int biggest(int a, int b, int c) {
		return a > b && a > c ? a : b > c ? b : c;
	}

	public int biggest(int... arr) {
		int big = arr[0];
		for (int i = 1; i <= arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}

	public int biggest(int[]... arr) {
		int big = arr[0][0];

		for (int[] sarr : arr) {
			for (int ele : sarr) {
				if (big < ele) {
					big = ele;
				}
			}
		}
		return big;

	}

//	public int biggest(int[] arr) {
//		int big = arr[0];
//		for (int i = 1; i <= arr.length; i++) {
//			if (big < arr[i]) {
//				big = arr[i];
//			}
//		}
//		return big;
//	}

	public static void main(String... args) {
		MathOperations obj = new MathOperations();
		obj.biggest(1, 2, 3, 4, 5);
	}
}
