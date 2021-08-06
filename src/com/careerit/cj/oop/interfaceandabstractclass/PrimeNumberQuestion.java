package com.careerit.cj.oop.interfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public interface PrimeNumberQuestion {

	public boolean isPrime(int num);

	default int countPrime(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}

	default List<Integer> primeInRange(int lb, int ub) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i))
				list.add(i);
		}
		return list;

	}

	default List<Integer> generateRandomNEvenNumbers(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while (n != list.size()) {
			int rnumber = ThreadLocalRandom.current().nextInt(1000, 2000);
			if (isEven(rnumber)) {
				list.add(rnumber);
			}
		}
		return list;

	}

	private boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static int maxNumber(int... a) {
		//Logic 
		return Integer.MAX_VALUE;
	}
}
