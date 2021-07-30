package com.careerit.cj.oop;

import java.util.concurrent.ThreadLocalRandom;

class C1 {
	void m1() {
		System.out.println("C1 of m1");
	}
}

class C2 extends C1 {
	void m1() {
		System.out.println("C2 of m1");
	}

	void m2() {
		System.out.println("C2 of m2");
	}
}

class C3 extends C1 {
	void m1() {
		System.out.println("C3 of m1");
	}

	void m2() {
		System.out.println("C3 of m2");
	}
	void m3() {
		System.out.println("C3 of m3");
	}
}

public class ClassCastingExample {
	public static void main(String[] args) {

		C1 obj = getInstance();
		
		if(obj instanceof C3) {
			C3 ref =(C3)obj;
			ref.m1();
			ref.m2();
			ref.m3();
		}else if(obj instanceof C2) {
			C2 ref =(C2)obj;
			ref.m1();
			ref.m2();
		}else {
			obj.m1();
			
		}

	}

	private static C1 getInstance() {
		int num = ThreadLocalRandom.current().nextInt(1, 3);
		if (num == 1) {
			return new C2();
		} else if (num == 2) {
			return new C3();
		}

		return new C1();
	}
}
