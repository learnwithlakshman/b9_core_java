package com.careerit.cj.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Main");
		try {
			int a = 10;
			int b = 2;
			int res = a/ b;
			System.out.println(res);
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("End of main");
	}
}
