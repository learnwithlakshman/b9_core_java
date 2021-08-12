package com.careerit.cj.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}

public class SetExample {

	public static void main(String[] args) {

		Product p1 = new Product("Lenovo ThinkPad", 65000);
		Product p3 = new Product("Lenovo ThinkPad", 65000);
		Product p2 = new Product("Dell XPS", 65000);
		Product p4 = p1;
		
		Set<Product> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set.size());
		
	
	}
}
