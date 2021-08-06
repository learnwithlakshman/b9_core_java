package com.careerit.cj.oop.interfaceandabstractclass;

import java.util.List;
import java.util.function.BiFunction;


interface Calc {
	int perform(int a, int b);
	
	default int increment() {
		return 1;
	}
	public static void showDetails() {
		
	}
	private static void data() {
		
	}
}

interface MyPredicate<T>{
	boolean  test(T t);
}

class MathOperations {

	List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

	public int result(BiFunction<Integer,Integer, Integer> biFun) {
		int res = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			int b = list.get(i);
			res = biFun.apply(res, b);
		}
		return res;
	}
}

public class MathManager {
	public static void main(String[] args) {

		Calc add = (a, b) -> a + b;
		Calc mul = (a, b) -> a * b;
		
		BiFunction<Integer,Integer, Integer> biFun = (a,b)->a + b;
		
		
		
		
		MyPredicate<Integer> ref = (ele) -> ele > 2 ;
		
		MathOperations obj = new MathOperations();
		
		int result = obj.result(biFun);
		System.out.println(result);
	}

}
