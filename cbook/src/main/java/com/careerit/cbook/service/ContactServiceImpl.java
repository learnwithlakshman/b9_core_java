package com.careerit.cbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.repo.ContactRepo;
import com.careerit.cbook.service.exception.ContactAlreadyExistsException;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public Contact addContact(Contact contact) throws ContactAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> allContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> addContacts(List<Contact> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
