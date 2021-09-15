package com.careerit.cbook.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.exception.ContactAlreadyExistsException;

public interface ContactService {

	public Contact addContact(Contact contact) throws ContactAlreadyExistsException;

	public Contact updateContact(Contact contact);

	public Page<Contact> allContacts(Pageable pageable);

	public List<Contact> search(String str);

	public boolean deleteContact(Long id);

	public List<Contact> addContacts(List<Contact> list);

	public Contact getContact(Long id);
}
