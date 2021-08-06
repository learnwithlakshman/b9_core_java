package com.careerit.cj.oop.interfaceandabstractclass;

import java.io.Serializable;

class Person implements Cloneable {

	private int age;
	private String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void incrementAge() {
		this.age++;
	}
	public String toString() {
		return "Name :" + name + " and Age :" + age;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}

public class MakerInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
				
			Person p = new Person(10, "Krish");
			p.incrementAge();
			System.out.println(p);
			
			Person p1 = p.clone();
			System.out.println(p1);
			
			p.incrementAge();
			System.out.println(p);
			System.out.println(p1);
			
		}
}
