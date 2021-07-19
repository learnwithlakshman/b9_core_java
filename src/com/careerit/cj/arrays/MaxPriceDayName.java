package com.careerit.cj.arrays;

public class MaxPriceDayName {

	public static void main(String[] args) {

		String[] dayNames = { "MON", "TUE", "WED", "THU", "FRI" };
		String[] names =    {"INFY", "TCS", "MINDTREE"};
		int[][] dataArr = { { 1521, 1554, 1589, 1620, 1650 }, { 3521, 3554, 3989, 3590, 3600 },
				{ 2521, 2154, 2989, 2590, 2600 } };

		// Get max element position
		int loc = 0;
		for (int[] arr : dataArr) {
			int max = arr[0];
			int pos = 0;
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					pos = i;
				}
			}
			System.out.println(names[loc] + " - max :" + max + " (" + dayNames[pos] + ")");
			loc++;
		}
	}
}
