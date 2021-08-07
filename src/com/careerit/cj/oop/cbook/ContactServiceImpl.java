package com.careerit.cj.oop.cbook;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ContactServiceImpl implements ContactService {

	private List<Contact> contacts;

	public ContactServiceImpl() {

		this.contacts = new ArrayList<Contact>();
	}

	@Override
	public Long addContact(Contact contact) {
		long cid = ThreadLocalRandom.current().nextLong(10001, 100000);
		contact.setCid(cid);
		contacts.add(contact);
		System.out.println("Contact is added with id :" + cid);
		return cid;
	}

	@Override
	public List<Contact> search(String str) {

		List<Contact> searchList = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if (contact.getName().contains(str)) {
				searchList.add(contact);
			}
		}
		System.out.println("Total " + searchList.size() + " contacts matched with given search string :" + str);

		return searchList;
	}

	@Override
	public Contact updateContact(Contact contact) {
		int pos = indexOfCid(contact.getCid());
		if (pos != -1) {
			contacts.set(pos, contact);
			System.out.println("Contact with id :" + contact.getCid() + " is updated");
		}
		return contact;
	}

	@Override
	public boolean deleteContact(Long id) {
		int pos = indexOfCid(id);
		if (pos != -1) {
			contacts.remove(pos);
			System.out.println("Contact is removed from the list");
			return true;
		}
		return false;
	}

	@Override
	public Contact getContact(Long id) {
		int pos = indexOfCid(id);
		if (pos != -1) {
			return contacts.get(pos);
		} else {
			System.out.println("Contact is not found with given id:" + id);
		}
		return null;
	}

	@Override
	public List<Contact> getContacts() {

		return contacts;
	}

	@Override
	public int addContacts(List<Contact> list) {
		contacts.addAll(list);
		return list.size();
	}

	private int indexOfCid(Long id) {
		if (contacts.size() != 0) {
			for (int i = 0; i < contacts.size(); i++) {
				Contact contact = contacts.get(i);
				if (contact.getCid() == id) {
					return i;
				}
			}
		}
		return -1;
	}

}
