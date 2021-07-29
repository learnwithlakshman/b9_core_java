package com.careerit.cj.oop.account;

import com.careerit.cj.oop.MaskUtil;

public class CBAccount extends Account {

		private final double OVER_DRAFT = 10000;

		public CBAccount(String name, double balance) {
			super(name, balance);
		}
		@Override
		public void withDraw(double amount) {

			if (amount < (this.balance + OVER_DRAFT)) {
				this.balance -= amount;
				System.out.println("Your account :" + MaskUtil.maskAccNumber(accNumber) + " is withdrawn  amount :" + amount
						+ " and current blance is :" + balance);
			} else {
				System.out.println("You don't have sufficient funds to withdraw :" + amount);
			}
		}
		
		
			
}
