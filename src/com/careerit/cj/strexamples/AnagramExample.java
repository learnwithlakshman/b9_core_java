package com.careerit.cj.strexamples;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {

		String name1 = "cat";
		String name2 = "aat";
		System.out.println(isAnagram(name1, name2));

	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1, arr2);
		}
		return false;
	}
}
