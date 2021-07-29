package com.careerit.cj.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.careerit.cj.oop.account.Account;



public class Manager {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1. Create 2. Deposit  3. Withdraw 4. Details 5. Show all 6. Exit");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				Account acc = getNewAccountDetails();
				System.out.println("Account is created with id : " + acc.getAccNumber());
				list.add(acc);
				break;
			case 2:
				System.out.println("Enter the account :");
				sc.nextLine();
				String accNum = sc.nextLine();
				Account account = validateAndGetAccount(list, accNum);
				if (account != null) {
					System.out.println("Enter the amount to deposit: ");
					double amount = sc.nextDouble();
					account.deposit(amount);
				} else {
					System.out.println("Please provide a valid account number");
				}
				break;
			case 3:
				System.out.println("Enter the account :");
				sc.nextLine();
				String num = sc.nextLine();
				Account waccount = validateAndGetAccount(list, num);
				if (waccount != null) {
					System.out.println("Enter the amount to withdraw: ");
					double amount = sc.nextDouble();
					waccount.withDraw(amount);
				} else {
					System.out.println("Please provide a valid account number");
				}
				break;

			case 4:
				System.out.println("Enter the account :");
				sc.nextLine();
				String accNumber = sc.nextLine();
				showAccountDetails(list, accNumber);
				break;

			case 5:
				if (list.size() != 0) {
					for (Account a : list) {
						a.showAccountDetails();
					}
				} else {
					System.out.println("No accounts are created yet... please create accounts to see details");
				}

				break;
			case 6:
				System.out.println("Programm is going to terminate....");
				sc.close();
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static Account validateAndGetAccount(List<Account> list, String accNum) {

		for (Account acc : list) {
			if (acc.getAccNumber().equalsIgnoreCase(accNum)) {
				return acc;
			}
		}
		return null;
	}

	private static void showAccountDetails(List<Account> list, String accNumber) {

		if (list.size() == 0) {
			System.out.println("There are no account to show details");
		}

		for (Account acc : list) {
			if (acc.getAccNumber().equalsIgnoreCase(accNumber)) {
				acc.showAccountDetails();
				break;
			}
		}

	}

	private static Account getNewAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your mobile: ");
		String mobile = sc.nextLine();
		System.out.println("Enter your opening balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the city name : ");
		String city = sc.nextLine();
		Account acc = new Account(name,  balance);
		return acc;
	}

}
