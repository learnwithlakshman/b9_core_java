package com.careerit.cj.oop.bankparser;

public class ParserFactory {

			public static ParseService getParaser(BankName bankName) {
				
					if(bankName == BankName.BOFA) {
						return new Bofa();
					}else if(bankName == BankName.JPM) {
						return new JPM();
					}else if(bankName == BankName.WF) {
						return new WellsForgo();
					}else if(bankName == BankName.SBI) {
						return new SBI();
					}
					throw new IllegalArgumentException("No support for given bank:"+bankName);
					
			}
}
