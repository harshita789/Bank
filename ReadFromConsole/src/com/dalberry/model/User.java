package com.dalberry.model;

import java.util.HashMap;

public class User {
	private UserContactDetails userContactDetails;
	private UserIdentification userIdentification;
	private UserMandatoryDetail userMandatoryDetail;
	private UserQualification userQualification;
	private Transaction transaction;
	private HashMap<String,UserAccount> uMap=new HashMap<>();
	
	
	public User() {

	}

	public User(UserAccount userAccount, UserContactDetails userContactDetails, UserIdentification userIdentification,
			UserMandatoryDetail userMandatoryDetail, UserQualification userQualification,Transaction transaction) {
		super();
		//this.userAccount = userAccount;
		this.userContactDetails = userContactDetails;
		this.userIdentification = userIdentification;
		this.userMandatoryDetail = userMandatoryDetail;
		this.userQualification = userQualification;
		this.transaction=transaction;
	}



	public UserContactDetails getUserContactDetails() {
		return userContactDetails;
	}

	public void setUserContactDetails(UserContactDetails userContactDetails) {
		this.userContactDetails = userContactDetails;
	}

	public UserIdentification getUserIdentification() {
		return userIdentification;
	}

	public void setUserIdentification(UserIdentification userIdentification) {
		this.userIdentification = userIdentification;
	}

	public UserMandatoryDetail getUserMandatoryDetail() {
		return userMandatoryDetail;
	}

	public void setUserMandatoryDetail(UserMandatoryDetail userMandatoryDetail) {
		this.userMandatoryDetail = userMandatoryDetail;
	}

	public UserQualification getUserQualification() {
		return userQualification;
	}

	public void setUserQualification(UserQualification userQualification) {
		this.userQualification = userQualification;
	}
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	

	public HashMap<String, UserAccount> getMap() {
		return uMap;
	}

	public void setMap(HashMap<String, UserAccount> map) {
		this.uMap = map;
	}
	

	@Override
	public String toString() {
		return "User [userContactDetails=" + userContactDetails + ", userIdentification=" + userIdentification
				+ ", userMandatoryDetail=" + userMandatoryDetail + ", userQualification=" + userQualification
				+ ", transaction=" + transaction + ", map=" + uMap + "]";
	}

    

    }
