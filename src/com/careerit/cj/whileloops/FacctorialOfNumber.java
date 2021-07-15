package com.careerit.cj.whileloops;

public class FacctorialOfNumber {

	public static void main(String[] args) {
		
			int num = 25;
			System.out.println(num);
			System.out.println(Integer.toHexString(num));
			
			Object obj = new Object();
			System.out.println(obj.hashCode());
			System.out.println(Integer.toHexString(obj.hashCode()));
			System.out.println(obj);
			
			num = 0x71dac704;
			System.out.println(num);
	}

	public static int factorial(int num) {
		int res = 1;
		int i = 2;
		while (i <= num) {
			res *= i;
			i++;
		}
		return res;
	}
}
