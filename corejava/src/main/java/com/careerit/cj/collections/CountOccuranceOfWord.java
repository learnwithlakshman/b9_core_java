package com.careerit.cj.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccuranceOfWord {

	public static void main(String[] args) {
		String str = "learning java is fun to have fun i am learning java and java is easy to learn";

		List<String> wordList = Stream.of(str.split(" ")).collect(Collectors.toList());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word:wordList) {
			map.put(word, map.getOrDefault(word,0)+1);
		}
	  
		System.out.println(map);

	}
}
