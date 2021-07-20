package com.careerit.cj.arrays;

import java.util.Arrays;

final class One{
	
		final void m1() {
			System.out.println("Hello M1");
		}
		
		final void m2() {
			System.out.println("M2... of One");
		}
}
class Two{
	
	
}

public class FinalKeyWord {

	private final int WORKING_HOURS = 8;
	private static final int HOLIDAYS_IN_YEAR = 22;

	public static void main(final String[] args) {
		final int NO_OF_DAYS_IN_WEEK = 7;
		args[0] = "Krish";
		System.out.println(Arrays.toString(args));
		Employee emp = new Employee("EMP-0007", "Krish", 4500, Dept.DEV);
		System.out.println(emp);
		updateSalary(emp, 500);
		System.out.println(emp);
		printCurrencyFormat(emp.getSalary());
		
		
		String name1 = "Manoj";
		String name2 = new String("Manoj");
		String name3 = new String(new char[] {'M','a','n','o','j'});
		
		
	}

	public static void updateSalary(final Employee e, double amount) {
		e.setSalary(e.getSalary() + amount);
	}

	public static void printCurrencyFormat(final double salary) {

		System.out.println("USD :" + salary);
	}
}
