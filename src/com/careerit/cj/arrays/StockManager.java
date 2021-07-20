package com.careerit.cj.arrays;

import java.util.concurrent.TimeUnit;

public class StockManager {

		public static void main(String[] args) throws InterruptedException {
			
				Stock stock = new Stock("TCS",3500);
				TimeUnit.SECONDS.sleep(5);
				Stock updateStock = stock.changePrice(70);
				
				stock.showDetails();
				updateStock.showDetails();
				
		}
}
