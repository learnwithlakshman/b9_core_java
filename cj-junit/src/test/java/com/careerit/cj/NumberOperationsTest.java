package com.careerit.cj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberOperationsTest {

	@Test
	public void biggestAasBig() {
		NumberOperations obj = new NumberOperations();
		int result = obj.biggest(15, 12, 10);
		int expected = 15;
		assertEquals(expected, result);
	}
	@Test
	public void biggestSameNumber() {
		NumberOperations obj = new NumberOperations();
		int result = obj.biggest(15, 10, 20);
		int expected = 20;
		assertEquals(expected, result);
	}
	@Test
	public void biggestBasBig() {
		NumberOperations obj = new NumberOperations();
		int result = obj.biggest(12, 15, 10);
		int expected = 15;
		assertEquals(expected, result);
	}

	@Test
	public void biggestCasBig() {
		NumberOperations obj = new NumberOperations();
		int result = obj.biggest(10, 12, 15);
		int expected = 15;
		assertEquals(expected, result);
	}

	@Test
	public void performWithIntegersAdd() {
		NumberOperations obj = new NumberOperations();
		int result = obj.perform(10, 20, (a, b) -> a + b);
		int expected = 30;
		assertEquals(expected, result);
	}

	@Test
	public void primeInProperRange() {
		NumberOperations obj = new NumberOperations();
		List<Integer> list = obj.primesInRange(2, 10); // 2, 3, 5, 7
		int expected = 4;
		assertEquals(expected, list.size());
	}
	
	@Test
	public void primeInRangeLt2() {
		NumberOperations obj = new NumberOperations();
		List<Integer> list = obj.primesInRange(0, 1); // 2, 3, 5, 7
		int expected = 0;
		assertEquals(expected, list.size());
	}

	@Test
	public void primeInNotProperRange() {
		NumberOperations obj = new NumberOperations();
		assertThrows(IllegalArgumentException.class, () -> obj.primesInRange(10, 3));
	}
}
