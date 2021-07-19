package com.careerit.cj.arrays;

import java.util.Arrays;

public class SumAndAverageOfSalaries {

		public static void main(String[] args) {
			
				float[] arr = getRandomSalaries();
				int len = arr.length;
				System.out.println(len);
				System.out.println(Arrays.toString(arr));
				
				float sum = 0;
				float min = arr[0],max = arr[0];
				for(int i=0;i<len;i++) {
					sum += arr[i];
					
					if(min > arr[i]) {
						min = arr[i];
					}
					
					if(max < arr[i] ) {
						max = arr[i];
					}
				}
				float avg = sum / len;
				System.out.println("The sum of "+len+" employees random salaries is :"+sum+" and average is :"+avg);
				System.out.println("Min :"+min);
				System.out.println("Max :"+max);
				
				
		}

		private static float[] getRandomSalaries() {
			// Logic 
			return  new float[]{60000,51000,50000,35000,45000,95000,85000,60000,75000,78000,45000};
		}
}
