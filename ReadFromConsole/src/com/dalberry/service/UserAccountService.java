package com.dalberry.service;


import java.util.List;

import com.dalberry.exception.InsufficientAmountException;
import com.dalberry.model.Transaction;
import com.dalberry.model.User;
import com.dalberry.model.UserAccount;
import com.dalberry.request.LoginRequest;

public class UserAccountService {
	private static final String DEBIT="Debit";
	private static final String CREDIT="Credit";
	
	private static UserAccountService userAccountService =new UserAccountService();
	
	private UserAccountService(){
		
	}
	
	public static UserAccountService getInstance(){
		return userAccountService;
	}
	
	
	
	public void debit(long amountToBeDebit, LoginRequest loginRequest,String Currency) throws InsufficientAmountException {
		User user = UserMap.getUserMap().get(loginRequest.getEmail());
		List<Transaction> listfromMap=user.getMap().get(Currency).getTransaction();
		System.out.println(listfromMap);
		
		
		UserAccount userAccount =user.getMap().get(Currency);
		long currentBalance=userAccount.getCurrentBalance();
		System.out.println("current balance is"+currentBalance);

		if (currentBalance < amountToBeDebit) {
			throw new InsufficientAmountException("your account balance is zero or You have entered amount greater than your Acc contains");
		} else {
			currentBalance = currentBalance - amountToBeDebit;
			
			user.getMap().get(Currency).setCurrentBalance(currentBalance);
			
			
			System.out.println("Your current balance is=" + user.getMap().get(Currency).getCurrentBalance());
			
			long transactionId = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			
			Transaction t = new Transaction();
			t.setType(UserAccountService.DEBIT);
			t.setTransactionId(transactionId);
			t.setAmount(amountToBeDebit);
			
			System.out.println(user);
			listfromMap.add(t);
		    user.getMap().get(Currency).setTransaction(listfromMap);
			
			
		}
	}

	public  void credit(long amountTobeCredited, LoginRequest loginRequest,String Currency) throws InsufficientAmountException {
		User user = UserMap.getUserMap().get(loginRequest.getEmail());
		long currentBalance = user.getMap().get(Currency).getCurrentBalance();
		System.out.println(currentBalance);
		
		List<Transaction> listfromMap=user.getMap().get(Currency).getTransaction();
		System.out.println(listfromMap);
		
		if (amountTobeCredited < 0) {
			throw new InsufficientAmountException("Amount Can't Be Negative");
		} else {
			currentBalance = currentBalance + amountTobeCredited;
			user.getMap().get(Currency).setCurrentBalance(currentBalance);
			System.out.println("your Current balance is="+user.getMap().get(Currency).getCurrentBalance());
			
			long transactionId = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			
			Transaction t=new Transaction();
			t.setType(UserAccountService.CREDIT);
			t.setTransactionId(transactionId);
			t.setAmount(amountTobeCredited);
			//transaction.add(t);
			
			System.out.println(user);
			listfromMap.add(t);
		    user.getMap().get(Currency).setTransaction(listfromMap);
			
			
		}

	}

	public void transactionDetails(LoginRequest loginRequest,String Currency) {
		
		User user = UserMap.getUserMap().get(loginRequest.getEmail());
		List<Transaction>transaction=user.getMap().get(Currency).getTransaction();
		System.out.println(transaction);
		
	}
}
