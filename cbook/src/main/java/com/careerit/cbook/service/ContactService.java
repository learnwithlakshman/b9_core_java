package com.careerit.cbook.service;

import java.util.List;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.exception.ContactAlreadyExistsException;

public interface ContactService {

	public Contact addContact(Contact contact) throws ContactAlreadyExistsException;

	public Contact updateContact(Contact contact);

	public List<Contact> allContacts();

	public List<Contact> search(String str);

	public boolean deleteContact(Long id);

	public List<Contact> addContacts(List<Contact> list);

	public Contact getContact(Long id);
}
