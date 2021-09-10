package com.careerit.cbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContactManager {

		@Autowired
		@Qualifier("DB")
		private ContactService contactService;
		
	

		public ContactService getContactService() {
			return contactService;
		}

		public void setContactService(ContactService contactService) {
			this.contactService = contactService;
		}
		
		
}
