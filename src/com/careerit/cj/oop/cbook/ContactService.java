package com.careerit.cj.oop.cbook;

import java.util.List;

public interface ContactService {

	public Long addContact(Contact contact);

	public List<Contact> search(String str);

	public Contact updateContact(Contact contact);

	public boolean deleteContact(Long id);

	public Contact getContact(Long id);

	public List<Contact> getContacts();

	public int addContacts(List<Contact> list);

}
