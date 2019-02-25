package com.dalberry.model;

public class UserIdentification {
	private String Document;
	private String cardNO;
	
	
	public UserIdentification(){
		
	}
	public String getDocument() {
		return Document;
	}
	public void setDocument(String document) {
		Document = document;
	}
	public String getCardNO() {
		return cardNO;
	}
	public void setCardNO(String cardNO) {
		this.cardNO = cardNO;
	}

	@Override
	public String toString() {
		return "UserIdentification [Document=" + Document + ", cardNO=" + cardNO + "]";
	}
	


	
	
	
	

}
