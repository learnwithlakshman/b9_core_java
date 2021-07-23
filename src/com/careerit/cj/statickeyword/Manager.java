package com.careerit.cj.statickeyword;
import static java.lang.System.*;
import static java.lang.Math.*;
class Account {

	private static String bankName = "LWLBANK";
	private String accNumber;
	private String name;
	private double balance;

	public static int count = 0;
	

	public Account(String accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public void withdraw(double amount) {
		if (balance > amount) {
			this.balance -= amount;
		} else {
			System.out.println("You don't enough funds to withdraw");
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void showDetails() {
		System.out.println("Acc number: " + accNumber);
		System.out.println("Name      : " + name);
		System.out.println("Balance   : " + balance);
		System.out.println("Bank Name :" + bankName);
	}

	static class Hello{
		
	}

}

public class Manager {
	
	static {
		System.out.println("Hello from static block -2");
	}
	

	public static void main(String[] args) {
		out.println("Main method");
		Account acc1 = new Account("SB10001", "Krish", 35000);
		Account acc2 = new Account("SB10002", "Manoj PVN", 3000);
		out.println(Account.count);
		
		System.out.println(sqrt(16));
		System.out.println(pow(2,4));
		
		
		
	}
	
}
