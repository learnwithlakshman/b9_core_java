package com.careerit.cj.oop.cbook;

import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				ContactService contactService = new ContactServiceImpl();
				
				Contact contact1 = new Contact("Krish", "krish@gmail.com","9876543210");

				Contact contact2 = new Contact("Manoj", "krish@gmail.com","9876543210");
				

				Contact contact3 = new Contact("Charan", "krish@gmail.com","9876543210");
				
				contactService.addContact(contact1);

				contactService.addContact(contact2);

				contactService.addContact(contact3);
				
				Contact contact4 =  contactService.getContacts().get(0);
				contact4.setEmail("alibaba@gamil.com");
				contact4.setName("Alibaba");
				contactService.updateContact(contact4);
				
				List<Contact> searchList = contactService.search("a");
				for(Contact c:searchList) {
					System.out.println(c);
				}
		}
}
