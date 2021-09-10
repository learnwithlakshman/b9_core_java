package com.careerit.cbook;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("DB")
public class ContactServiceDbImpl implements ContactService {

	
	public ContactServiceDbImpl() {
		System.out.println("Contact Service DB Impl");
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
