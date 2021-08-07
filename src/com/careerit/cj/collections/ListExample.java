package com.careerit.cj.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class A {

}

class B extends A {

}

class C extends A {

}

public class ListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(1001);
		list.add(10001);

		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		list.remove(1);
		list.remove(Integer.valueOf(100));
		System.out.println(list);

		List<Integer> ll = List.of(1, 2, 3, 4, 5);

		list.addAll(0,ll);
		
		list.contains(1001);
		
		
		System.out.println(list);
//		for (int i = 0; i < list.size(); i++) {
//			Integer ref = list.get(i);
//			System.out.println(ref);
//		}
//		for(Integer ele:list) {
//			System.out.println(ele);
//		}
//
//		System.out.println(list);
//
//		float a = 4.5f;
//		int b = (int) a;
//
//		Object obj = new C();
//
//		A ref = (A) obj;
//
//		String salStr = "987774.50";
//		double sal = Double.parseDouble(salStr);

	}
}
