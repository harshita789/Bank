package com.dalberry.model;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
	private long accountNo;
	private String currency;
	private long currentBalance;
	private List<Transaction>transaction = new ArrayList<>();
	
	public UserAccount(){
		
	}
	
    public UserAccount(long accountNo, String currency, long currentBalance) {
		super();
		this.accountNo = accountNo;
		this.currency = currency;
		this.currentBalance = currentBalance;
	}


	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(long currentBalance) {
		this.currentBalance = currentBalance;
	}
	
    public List<Transaction> getTransaction() {
		return transaction;
	}


	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
    public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "UserAccount [accountNo=" + accountNo + "currentBalance=" + currentBalance
				+ ", transaction=" + transaction + "]";
	}


	
}
	
	