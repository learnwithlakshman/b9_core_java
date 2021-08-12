package com.careerit.cj.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFunctionExample {

	public static void main(String[] args) {

		String[] arr = "3002,4005,5005,1005,5001,2500,4500".split(",");

		// Multiply each number 2 store all the number in a container
		List<Integer> list = Stream.of(arr)
				     .map(e -> Integer.parseInt(e) * 2)
				     .collect(Collectors.toList());
		System.out.println(list);
	}
}
