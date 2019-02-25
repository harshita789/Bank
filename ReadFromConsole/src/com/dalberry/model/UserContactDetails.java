package com.dalberry.model;

public class UserContactDetails {
	private String mobileNo;
	private String currentAddress;
	private String parmanenetAddress;
	private String UserCountry;
	
	
	public UserContactDetails(){
		
	}
	
	
	public UserContactDetails(String mobileNo, String currentAddress, String parmanenetAddress, String userCountry) {
		super();
		this.mobileNo = mobileNo;
		this.currentAddress = currentAddress;
		this.parmanenetAddress = parmanenetAddress;
		UserCountry = userCountry;
	}


	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getParmanenetAddress() {
		return parmanenetAddress;
	}
	public void setParmanenetAddress(String parmanenetAddress) {
		this.parmanenetAddress = parmanenetAddress;
	}
	
   public String getUserCountry() {
		return UserCountry;
	}
	public void setUserCountry(String userCountry) {
		UserCountry = userCountry;
	}


	@Override
	public String toString() {
		return "UserContactDetails [mobileNo=" + mobileNo + ", currentAddress=" + currentAddress
				+ ", parmanenetAddress=" + parmanenetAddress + ", UserCountry=" + UserCountry + "]";
	}
	
	

	

	
	
	
	
	
	
	
	


}
