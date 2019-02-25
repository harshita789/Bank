package com.dalberry.request;

public class LoginRequest {
	private String email;
	private String password;
	private String Currency;
	//private UserAccount userAccount;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	@Override
	public String toString() {
		return "LoginRequest [email=" + email + ", password=" + password + ", Currency=" + Currency + "]";
	}

	
	
	

}
