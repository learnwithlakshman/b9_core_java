package com.careerit.cj.oop.currency;

public class CurrencyService {

	public static Currency getCurrency(String countryCode) {

		if (countryCode == "144") {
			return new Srilanka();
		} else if (countryCode == "356") {
			return new Inida();
		} else if (countryCode == "456") {
			return new USA();
		}
		throw new IllegalArgumentException("The country code :" + countryCode + " no support....");
	}
}
