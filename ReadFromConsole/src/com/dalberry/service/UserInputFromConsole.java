package com.dalberry.service;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.dalberry.model.BusinessDetails;
import com.dalberry.model.UserAccount;
import com.dalberry.model.UserContactDetails;
import com.dalberry.model.UserIdentification;
import com.dalberry.model.UserMandatoryDetail;
import com.dalberry.model.UserQualification;
import com.dalberry.request.LoginRequest;
import com.dalberry.utils.MyBankUtility;
import com.dalberry.utils.ReadFromPropertyFile;

public class UserInputFromConsole {

	public static UserMandatoryDetail fetchUserMandatoryDetails() {
		System.out.println("Enter Mandatory Details");
		System.out.println("Enter Username");
		String userName = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Password");
		String password = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Age");
		int age = Integer.parseInt(MyBankUtility.readInputFromConsole());

		System.out.println("Enter City");
		String city = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Email");
		String email = MyBankUtility.readInputFromConsole();
		
		LoginRequest loginRequest=new LoginRequest();
		loginRequest.setEmail(email);
		loginRequest.setPassword(password);
		

		UserMandatoryDetail userMandatoryDetail = new UserMandatoryDetail();
		userMandatoryDetail.setUserName(userName);
		userMandatoryDetail.setPassword(password);
		userMandatoryDetail.setAge(age);
		userMandatoryDetail.setCity(city);
		userMandatoryDetail.setEmail(email);

		// UserInputFromConsole.fetchUserDetails(userMandatoryDetail);
		return userMandatoryDetail;
	}

	public static UserContactDetails fetchUserContactDetails() throws IOException {
		System.out.println("enter Contact Details");
		System.out.println("Enter Mobile no");
		String mobileNo = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Parmanent Address ");
		String parmanentAddress = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Current Address");
		String currentAddress = MyBankUtility.readInputFromConsole();

		System.out.println("Choose from below Countries");
		List<String>allcountries=ReadFromPropertyFile.getAllCountriesList();
		System.out.println(allcountries);
		String userSelection = MyBankUtility.readInputFromConsole();
		boolean b= MyBankUtility.checkAvailabilityOfCountry(userSelection); 
		    if(b) {
			UserContactDetails userContactDetails = new UserContactDetails();
			userContactDetails.setMobileNo(mobileNo);
			userContactDetails.setCurrentAddress(currentAddress);
			userContactDetails.setParmanenetAddress(parmanentAddress);
			userContactDetails.setUserCountry(userSelection);
			return userContactDetails;
		} else {
			System.out.println("we do not provide service for Country you hav entered");
			return null;
		}
	}

	public static UserQualification fetchUserQualificationDetails() {
		System.out.println("Enter Highest Qualification");
		String highestQualification = MyBankUtility.readInputFromConsole();

		UserQualification userQualification = new UserQualification();
		userQualification.setHighestQualification(highestQualification);

		return userQualification;
	}

	public static void fetchUserBusinessDetails() {
		System.out.println("Enter Annual Income");
		String annualIncome = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Business Type");
		System.out.println("Administrative");
		System.out.println("Dirrector");
		String businessType = (MyBankUtility.readInputFromConsole());

		BusinessDetails businessDetails = new BusinessDetails();
		businessDetails.setAnnualIncome(annualIncome);
		businessDetails.setBusinessType(businessType);

	}

	public static UserIdentification fetchUserIdentification() throws IOException {
		System.out.println("choose from these two");
		System.out.println(ReadFromPropertyFile.getIdProofAcceptedList());
		String document = MyBankUtility.readInputFromConsole();

		System.out.println("Enter Card No");
		String cardNo = MyBankUtility.readInputFromConsole();

		UserIdentification userIdentification = new UserIdentification();
		userIdentification.setDocument(document);
		userIdentification.setCardNO(cardNo);
		return userIdentification;

	}

	public static UserAccount fetchAccountDetail() throws Exception {
		Random rand = new Random();

		long accountNo = (long) (rand.nextDouble() * 10000000000L);
		System.out.println("Your Account No is=" + accountNo);

		System.out.println("Select From Currency for which you want to open Account");
		System.out.println(ReadFromPropertyFile.getAllCurrencyList());
		String currency = MyBankUtility.readInputFromConsole();

		UserAccount userAccount = new UserAccount();
		userAccount.setAccountNo(accountNo);
		userAccount.setCurrency(currency);

		return userAccount;

	}
	public static LoginRequest fetchUserDetailForLogin(){
		System.out.println("Enter Email");
		String email = MyBankUtility.readInputFromConsole();
		
		System.out.println("Enter Password");
		String password = MyBankUtility.readInputFromConsole();
		
		LoginRequest loginRequest=new LoginRequest();
		loginRequest.setEmail(email);
		loginRequest.setPassword(password);
		
		return loginRequest;
		
	}

}
