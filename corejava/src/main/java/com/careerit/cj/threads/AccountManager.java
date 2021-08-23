package com.careerit.cj.threads;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(double amount) {
		if (this.balance < amount) {
			try {
				System.out.println("Thread is going wait.....");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.balance -= amount;
			System.out.println("After withdraw of " + amount + " current balance :" + balance);
		}
	}

	public synchronized void deposit(double amount) {

		this.balance += amount;
		notify();
	}

}

public class AccountManager {

	public static void main(String[] args) {
		Account acc = new Account(1000);

		Thread t1 = new Thread(() -> {
			acc.withdraw(5000);
		});
		Thread t2 = new Thread(() -> {
			acc.deposit(5000);
		});

		t1.start();
		t2.start();

		List<Integer> list = IntStream.range(1, 5000).boxed().collect(Collectors.toList());
		long sms = System.currentTimeMillis();
		int res = list.parallelStream().mapToInt(e -> convertToInt(e)).sum();
		System.out.println(res);
		long ems = System.currentTimeMillis();
		System.out.println(ems - sms);
	}

	private static int convertToInt(int ele) {
		try {
			TimeUnit.MICROSECONDS.sleep(1);

		} catch (Exception e) {
	
		}
		return ele;
	}
}
