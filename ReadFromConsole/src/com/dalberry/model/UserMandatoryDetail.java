package com.dalberry.model;



public class UserMandatoryDetail {
	private String userName;
	private String password;
	private int age;
	private String city;
	private String Email;
	
    public UserMandatoryDetail(){
		
	}
    

	public UserMandatoryDetail(String userName, String password, int age, String city, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.city = city;
		Email = email;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "UserMandatoryDetail [userName=" + userName + ", password=" + password + ", age=" + age + ", city="
				+ city + ", Email=" + Email + "]";
	}
}
	
    
 
