package com.careerit.cj.oop;

public class GcdOfNumbers {
	public int gcd(int a, int b) {
		 while(a != b) {
				if(a > b)
					a = a -b;
				else
					b = b - a;
			}
			return a;		
	}
	
	public int gcd(int a, int b,int c) {
		return gcd(gcd(a,b),c);
	}
	

	public static void main(String[] args) {
		GcdOfNumbers obj = new GcdOfNumbers();
		System.out.println(obj.gcd(35,14));
	}
}
