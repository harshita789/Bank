package com.dalberry.exception;

public class IncorrectEmailOrPasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectEmailOrPasswordException() {

	}

	public IncorrectEmailOrPasswordException(String str) {
		super(str);

	}

}
