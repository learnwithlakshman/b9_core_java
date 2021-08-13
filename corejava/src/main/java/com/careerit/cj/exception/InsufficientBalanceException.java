package com.careerit.cj.exception;

public class InsufficientBalanceException  extends RuntimeException{

		private String message;

		
		
		public InsufficientBalanceException() {
			this.message = "You don't sufficient funds, please check the balance";
		}

		public InsufficientBalanceException(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "InsufficientBalanceException [message=" + message + "]";
		}
		
		
		
}
