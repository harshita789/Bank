package com.dalberry.exception;

public class InsufficientAmountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientAmountException(){
		
	}
	
	public InsufficientAmountException(String str){
		super(str);
	}

}
