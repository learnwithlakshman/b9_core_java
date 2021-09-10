package com.careerit.cbook;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("INM")
public class ContactServiceInmemoryImpl implements ContactService {

	public ContactServiceInmemoryImpl() {
		System.out.println("Contact Service In meomory Impl");
	}
	
	@Override
	public long addContact() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
