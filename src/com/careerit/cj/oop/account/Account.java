package com.careerit.cj.oop.account;

import com.careerit.cj.oop.IdGenerator;
import com.careerit.cj.oop.MaskUtil;

public class Account {

	String accNumber;
	String name;
	double balance;

	public Account(String name, double balance) {
		this.accNumber = IdGenerator.getNewId();
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Your account :" + MaskUtil.maskAccNumber(accNumber) + " is deposited  amount :" + amount
				+ " and current blance is :" + balance);
	}

	public void withDraw(double amount) {

		if (amount < this.balance) {
			this.balance -= amount;
			System.out.println("Your account :" + MaskUtil.maskAccNumber(accNumber) + " is withdrawn  amount :" + amount
					+ " and current blance is :" + balance);
		} else {
			System.out.println("You don't have sufficient funds to withdraw :" + amount);
		}
	}

	public void showAccountDetails() {
		System.out.println("Account number :" + MaskUtil.maskAccNumber(accNumber));
		System.out.println("Name           :" + name);
		System.out.println("Balance        :" + balance);
	}

	public String getAccNumber() {
		return accNumber;
	}
}
