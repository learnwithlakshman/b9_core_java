package com.careerit.cj.oop.cbook;

public class Manager {

		public static void main(String[] args) {
			
				ContactService contactService = //new ContactServiceImpl();
												new ContactServiceDBImpl();
				
		}
}
