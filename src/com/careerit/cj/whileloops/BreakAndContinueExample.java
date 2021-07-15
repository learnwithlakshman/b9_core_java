package com.careerit.cj.whileloops;

public class BreakAndContinueExample {

	// Search key in the given array if key is found return position otherwise
	// return -1
	public static int search(int[] arr, int key) {

		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (ele == key) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	// Print array elements which are not divisible by key
	public static void printNumbers(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (ele % key == 0) {
				continue;
			}
			System.out.println(ele);
		}

	}
}
