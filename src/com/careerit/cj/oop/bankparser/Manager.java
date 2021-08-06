package com.careerit.cj.oop.bankparser;

import java.util.List;


enum BankName{
	BOFA,JPM,WF, SBI
}

public class Manager {

	
		public static void main(String[] args) {
			
			
				String file="AUG_2021.pdf";
				BankName bankName = BankName.SBI;
				
				ParseService parser = ParserFactory.getParaser(bankName);
				
				List<ActivityDetails> list = parser.parase(file);
				//Logic
				
		}
}
