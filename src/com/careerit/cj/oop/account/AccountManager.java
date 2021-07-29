package com.careerit.cj.oop.account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

	
		public static void main(String[] args) {
			
				// 1. Load all accounts into a list
				// 2. Display only savings accounts
				// 3. Display only current accounts
				// 3. Display count and total balance of savings account
				
		}
		
		
		public static List<Account> loadAccounts(String fileName){
			
				List<Account> accountList = new ArrayList<Account>();
				//Logic to read data from csv file, convert each row to account object and put into list
			
			
				return accountList;
		}
		
		public static List<Account> getAccounts(List<Account> list,String accType){
				List<Account> accountList = new ArrayList<Account>();	
				// accType = "SB" then filter all the sb accounts and put into list return the same
				// accType = "CB" then filter all the sb accounts and put into list return the same
				
				return accountList;
		}
		
}
