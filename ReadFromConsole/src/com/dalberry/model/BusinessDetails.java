package com.dalberry.model;

public class BusinessDetails {
	private String annualIncome;
	private String businessType;
	
	public BusinessDetails(){
		
	}
	
	
	public BusinessDetails(String annualIncome, String businessType) {
		super();
		this.annualIncome = annualIncome;
		this.businessType = businessType;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	@Override
	public String toString() {
		return "BusinessDetails [annualIncome=" + annualIncome + ", businessType=" + businessType + "]";
	}
	
	

}
