package com.dalberry.exception;

public class AccountCreationFailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountCreationFailException() {

	}

	public AccountCreationFailException(String str) {
		super(str);
	}
}
