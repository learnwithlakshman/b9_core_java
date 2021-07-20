package com.careerit.cj.arrays;

import java.time.LocalDateTime;

public class Stock {

	private final String cname;
	private final double price;
	private final LocalDateTime localDateTime;

	public Stock(String cname, double price) {
		this.cname = cname;
		this.price = price;
		this.localDateTime = LocalDateTime.now();
	}

	public Stock changePrice(double amount) {
		return new Stock(cname, price + amount);
	}

	public void showDetails() {
		System.out.println("Name  :" + cname);
		System.out.println("Price :" + price);
		System.out.println("Time  :" + localDateTime);
	}

	public String getCname() {
		return cname;
	}

	public double getPrice() {
		return price;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

}
