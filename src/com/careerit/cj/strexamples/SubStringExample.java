package com.careerit.cj.strexamples;

import java.util.Arrays;

public class SubStringExample {

	public static void main(String[] args) {

	
		String data = "welcome";
		int size = 3;
		String[] arr = getWords(data, size);
		System.out.println(Arrays.toString(arr));
	}

	public static String[] getWords(String data, int len) {
    	if (data.length() > len) {
			int size = data.length() - len + 1;
			String[] dataArr = new String[size];
			for (int i = 0; i < size; i++) {		
				String sub = data.substring(i, i + len);
				dataArr[i] = sub;
			}
			return dataArr;
		}

		return new String[] { data };

	}
}
