package com.careerit.cbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.repo.ContactRepo;
import com.careerit.cbook.service.exception.ContactAlreadyExistsException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;

	@Override
	public Contact addContact(Contact contact) throws ContactAlreadyExistsException {
		Assert.notNull(contact, "Contact object can't be null");
		Assert.hasText(contact.getEmail(), "Email can't be empty");

		if (checkEmailExists(contact.getEmail())) {
			log.info("Already contact exists with given email:{}", contact.getEmail());
			throw new ContactAlreadyExistsException("Contact with email" + contact.getEmail() + " already exists");
		}
		contactRepo.save(contact);
		log.info("Contact is added with id :{}", contact.getId());
		return contact;
	}

	private boolean checkEmailExists(String email) {
		return contactRepo.findByEmail(email).isPresent();
	}

	@Override
	public Contact updateContact(Contact contact) {
		contactRepo.save(contact);
		return contact;
	}

	@Override
	public Page<Contact> allContacts(Pageable pageable) {
		Page<Contact> page = contactRepo.findAll(pageable);
		return page;
	}

	@Override
	public List<Contact> search(String str) {
		log.info("Search word :{}", str);
		List<Contact> list = contactRepo.search(str);
		log.info("Total  {} contacts found for given search string {}", list.size(), str);
		return list;
	}

	@Override
	public boolean deleteContact(Long id) {
		Optional<Contact> optContact = contactRepo.findById(id);
		if (optContact.isPresent()) {
			contactRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> addContacts(List<Contact> list) {
		list = contactRepo.saveAll(list);
		log.info("Total {} contacts saved into db", list.size());
		return list;
	}

	@Override
	public Contact getContact(Long id) {
		Optional<Contact> optContact = contactRepo.findById(id);
		return optContact.orElseThrow(() -> new IllegalArgumentException("Contact is not found with id:" + id));
	}

}
