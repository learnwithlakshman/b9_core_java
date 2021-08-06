package com.careerit.cj.oop.bankparser;

public class ActivityDetails {

		private String name;
		private double quantity;
		private double price;
		
		public ActivityDetails(String name, double quantity, double price) {
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getQuantity() {
			return quantity;
		}
		public void setQuantity(double quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
}
