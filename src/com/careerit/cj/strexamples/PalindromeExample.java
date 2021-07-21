package com.careerit.cj.strexamples;

public class PalindromeExample {

	public static void main(String[] args) {

		String[] arr = "liril,amma,dad,pears,sister,brother,1234,12321".split(",");
		int count = countPalindromes(arr);
		System.out.println("Count of palindromes :"+count);
	}

	private static int countPalindromes(String[] arr) {
		int count = 0;
		for (String name : arr) {
			if (palindrome(name)) {
				count++;
			}
		}
		return count;
	}

	private static boolean palindrome(String data) {
		for (int i = 0, j = data.length() - 1; i <= j; i++, j--) {
			if (data.charAt(i) != data.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
