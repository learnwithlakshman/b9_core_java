package com.careerit.cj.basics;

import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the num1 : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the num2 : ");
				int num2 = sc.nextInt();
				
				int sum = num1 + num2;
				int sub = num1 - num2;
				int mul = num1 * num2;
				int div = num1 / num2;
				int mod = num1 % num2;
				
				
				System.out.println("The value of num1 is "+num1);
				
				System.out.println(num1+" + "+num2+" = "+sum);
				System.out.println(num1+" - "+num2+" = "+sub);
				System.out.println(num1+" * "+num2+" = "+mul);
				System.out.println(num1+" / "+num2+" = "+div);
				System.out.println(num1+" % "+num2+" = "+mod);
				sc.close();
				
		}
}
