package com.careerit.cj.oop.currency;

public class Manager {

		public static void main(String[] args) {
			Currency currency=CurrencyService.getCurrency("456");
			System.out.println(currency.currencyCode());
			
		}
}
