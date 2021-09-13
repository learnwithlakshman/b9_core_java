package com.careerit.cbook.service.exception;

public class ContactAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContactAlreadyExistsException(String message) {
		super(message);
	}
}
