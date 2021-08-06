package com.careerit.cj.oop.interfaceandabstractclass;

import java.util.List;

abstract class Account {

	public void showDetails() {
		// ---
	}

	public void deposit(double amount) {
		// ---
	}

	void withDraw(double amount) {

	}
}

class SavingsAccount extends Account {

	public void withDraw(double amount) {
		// ---
	}

	@Override
	public void showDetails() {

	}
}

class CurrentAccount extends Account {

	public void withDraw(double amount) {

	}
}

abstract class MyMath {
	public List<Integer> generatePrimeInRange(int lb, int ub) {
		isPrime();
		return null;
	}

	abstract boolean isPrime();

	int countPrimeInRange(int lb, int ub) {
		isPrime();
		return 1;
	}
}

class Abc extends MyMath {
	@Override
	boolean isPrime() {
		// TODO Auto-generated method stub
		return false;
	}
}

abstract class C1 {
	abstract void m1();

	abstract void m2();

	abstract void m3();
}

abstract class C2 extends C1 {
	public void m1() {

	}
}

class C3 extends C2 {
	@Override
	public void m2() {

	}
	@Override
	public void m3() {

	}
}

public class Manager {

	public static void main(String[] args) {
		MyMath obj = new Abc();
		obj.countPrimeInRange(1, 100);
	}
}
