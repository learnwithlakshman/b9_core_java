package com.careerit.cj.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Account {

		private int accNumber;
		private String name;
		private double balance;
		
		
		public void withDraw(double amount) {
			
					if(amount > balance) {
						throw new InsufficientBalanceException();
					}
					
					balance = balance - amount;
		}
}
