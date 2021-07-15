package com.careerit.cj.whileloops;

public class NumberQuestions {
	
	public static void main(String[] args) {
			
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev =  rev * 10 + num % 10;
			num /=  10;
		}
		return rev;
	}

	public static boolean isPalindrome(int num) {
			return reverse(num) == num;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum =  sum + num % 10;
			num /=  10;
		}
		return sum;
	}

	public static boolean isAmstrong(int num) {
		int sum = 0;
		int temp = num;
		while (num != 0) {
			int r = num % 10;
			sum =  sum + (int)Math.pow(r, 3);
			num /=  10;
		}
		return sum == temp;
	}
}
