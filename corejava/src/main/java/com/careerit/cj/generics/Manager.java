package com.careerit.cj.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.careerit.cj.collections.ipl.Player;

class MyList<T>{
	
	List<T> list = new ArrayList<>();
	
	void add(T ele) {
		
	}
	void remove(T ele) {
		
	}
	
}

public class Manager {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4);
		List<Integer> list2 = List.of(3,4,5,2,6);

		List<Integer> list3 = removeDuplicates(list1, list2);
		System.out.println(list3);
		
		MyList<Integer> mylist = new MyList<>();
		mylist.add(1001);
		mylist.add(1002);
		mylist.add(1003);
		mylist.remove(1002);
	}

	public static <T extends Number> List<T> removeDuplicates(List<T> list1, List<T> list2) {
		return List.of(list1, list2).stream().flatMap(List::stream).distinct().collect(Collectors.toList());
	}
	
	public static MyList<?> getInstance(){
		return new MyList<String>();
	}
}
