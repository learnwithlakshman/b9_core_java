package com.careerit.cj.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);

		System.out.println(list);

		// For loops
		System.out.println("------------ Using for loop ------------");
		for (int i = 0; i < list.size(); i++) {
			int ele = list.get(i);
			System.out.println(ele);
		}
		System.out.println("------------ Using for-each -------------");
		for (Integer ele : list) {
			System.out.println(ele);
		}
		System.out.println("----------- Iterator --------------------");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			if (ele == 50) {
				itr.remove();
			}
			System.out.println(ele);
		}

		System.out.println("----------- List iterator --------------");
		ListIterator<Integer> litr = list.listIterator();
		while (litr.hasNext()) {
			int ele = litr.next();
			if (ele == 40) {
				litr.set(400);
			}
			System.out.println(ele);
		}
		System.out.println("----------- Reverse order --------------");
		while (litr.hasPrevious()) {
			int ele = litr.previous();
			System.out.println(ele);
		}
		System.out.println(list);

		// Functional interfaces
		// Lambda () -> { }

		list.stream().forEach(ele -> System.out.println(ele));

		// Adding list to another

		List<Integer> oddList = Arrays.asList(15, 25, 35, 45);
		list.addAll(oddList);

		System.out.println(list);

		int index = list.indexOf(400);
		list.set(index, 40);
		System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
		System.out.println(list);

		list.sort((Integer o1, Integer o2) -> o2.compareTo(o1));

		// Get all the even numbers as list from the given list

		List<Integer> evenList = list.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList());

		// Get all the numbers which are divisible 5 only even numbers

		List<Integer> evenDivisibleBy5List = list.stream().filter(ele -> ele % 5 == 0 && ele % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenDivisibleBy5List);

		System.out.println(evenList);
		
		
		List<String> names = List.of("Rajesh", "Mahesh", "Suresh", "Jayesh","Manu","John","Kiran");
		
		List<String> nameWith4Characters =  filter(names,ele->ele.length()==4);
		List<String> nameWithLetterAInit = filter(names,name->name.toLowerCase().contains("a"));
		List<String> nameWithLetterAInitAndLt5Chars =filter(names,name->(name.toLowerCase().contains("a") && name.length() <=5));
		
		filter(List.of(1, 3,5),ele -> ele > 1 );

		System.out.println(nameWithLetterAInit);
		System.out.println(nameWith4Characters);
		System.out.println(nameWithLetterAInitAndLt5Chars);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
				List<T> mylist = new ArrayList<>();
				for(T t:list) {
					if(predicate.test(t)) {
						mylist.add(t);
					}
				}
				return mylist;
	}
}
