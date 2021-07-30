package com.careerit.cj.oop;

class One{
	int a = 100;
	public One() {
		super();
		System.out.println("One");
	}
	public void m1() {
		System.out.println("Hello M1 of One");
	}
}
class Two extends One{
	int a = 999;
	public Two() {
		super();
		System.out.println("Two");
	}
	
	@Override
	public void m1() {
		System.out.println("Hello M1 of Two");
	}
	
	
}
class Three extends Two{
	
	
	public Three() {
		System.out.println("Three");
	}
	
	@Override
	public void m1() {
		super.m1();
		System.out.println("Hello M1 of Three");
	}
}
public class TypecastingManager {

		public static void main(String[] args) {
			
				One obj = new Three();
				obj.m1();
				System.out.println(obj.a);
				
		}
}
