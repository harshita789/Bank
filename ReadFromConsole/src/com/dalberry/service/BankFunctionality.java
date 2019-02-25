package com.dalberry.service;

import com.dalberry.request.LoginRequest;

public interface BankFunctionality {
	public void debit(long amountToBeDebit, LoginRequest loginRequest,String Currency) throws InsufficientAmountException;
	public void credit(long amountToBeCredited, LoginRequest loginRequest,String Currency)throws InsufficientAmountException;;
	

}
