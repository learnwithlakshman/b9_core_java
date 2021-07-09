package com.careerit.cj.conditionalstmt;

import java.util.Scanner;

/**
 * 
 * @author learn
 * 
 * Program to find the discount on bill amount, if bill amount > 5000 then discount would be 10% 
 */

public class DiscountCalculator {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Bill Amount : ");
			
			int billAmount = sc.nextInt();
			float discount = 0;
			
			if (billAmount > 5000) {
				discount = billAmount * 0.1f;
			}
			
			float net_amount = billAmount - discount;
			System.out.println("Bill amount :"+billAmount);
			System.out.println("Discount    :"+discount);
			System.out.println("Net amount  :"+net_amount);
			
			sc.close();
		}
}
