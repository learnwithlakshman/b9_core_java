package com.careerit.cj;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class NumberOperations {

	public int biggest(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}

	}

	public List<Integer> primesInRange(int lb, int ub) {
		if(ub < lb) {
			throw new IllegalArgumentException("ub value can't be gt lb");
		}
		List<Integer> list = new ArrayList<>();
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num % 2 == 0 && num != 2)
			return false;
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public <T, U, R> R perform(T t, U u, BiFunction<T, U, R> biFun) {
		return biFun.apply(t, u);
	}

}
