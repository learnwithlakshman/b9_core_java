package com.careerit.cj.oop;

class User {

	String username;
	String password;
	static {
		System.out.println("Block-1");
	}
	{
		System.out.println("IIB of User");
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		System.out.println("One");
	}

}

class AdminUser extends User {
	private String[] permissions;
	static {
		System.out.println("Block-2");
	}
	{
		System.out.println("IIB of AdminUser");
	}

	public AdminUser(String username, String password, String... permission) {
		super(username, password);
		this.permissions = permission;
		System.out.println("Two");
	}
}

public class ParentAndChildManager {

	public static void main(String[] args) {
		User user1 = new AdminUser("krish", "krish@123#", "READ", "WRITE");
		User user2 = new AdminUser("krish", "krish@123#", "READ", "WRITE");
	}
}
