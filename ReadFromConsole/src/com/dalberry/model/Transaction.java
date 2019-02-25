package com.dalberry.model;

public class Transaction {
	
	private long Amount;
	private String Type;
	private long transactionId;
	//private String currency;
	
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	
   
	@Override
	public String toString() {
		return " [Amount " + Amount + " is " + Type + " by transactionId=" + transactionId + "]";
	}
	
	
	
	
	

}
