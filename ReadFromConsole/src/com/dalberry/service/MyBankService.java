package com.dalberry.service;

import com.dalberry.exception.InvalidInputException;
import com.dalberry.request.LoginRequest;
import com.dalberry.utils.MyBankUtility;

public class MyBankService {
	public static MyBankService myBankService=new MyBankService();
	
	
	private  MyBankService(){
		
	}
	
	public static MyBankService getInstance(){
		return myBankService;
	}


	public  void applicationMenu() throws Exception {
		char ch = ' ';
		do {
			System.out.println(" Welcome Select From The Option");
			System.out.println("1.Register User");
			System.out.println("2.Login");

			int userChoice = Integer.parseInt(MyBankUtility.readInputFromConsole());
			switch (userChoice) {
			case 1:FetchUserDetails fetchUserDetail=new FetchUserDetails();
			fetchUserDetail.fetchUserDetailsForRegistration();
				break;

			case 2:FetchUserDetails fetchUserDetailForLogin=new FetchUserDetails();
				LoginRequest loginRequest=fetchUserDetailForLogin.fetchUserDetailsForLogin();
				if (loginRequest!=null) {
					System.out.println("select Currency from below Options");
					System.out.println("1.INR");
					System.out.println("2.EUR");
					System.out.println("3.DOLLAR");

					String choice = MyBankUtility.readInputFromConsole();
					switch (choice) {
					
					case "INR":
						   System.out.println("1.Credit");
					       System.out.println("2.Debit");
					       System.out.println("3.Transaction Details");
					       
					    int selection = Integer.parseInt(MyBankUtility.readInputFromConsole());
					   switch(selection) {
					   case 1: 
						   System.out.println("enter balance to Credit");
					   long amountTobeCredited = Long.parseLong(MyBankUtility.readInputFromConsole());
					   UserAccountService userAccountService  =UserAccountService.getInstance();
					   
					   userAccountService.credit(amountTobeCredited,loginRequest,choice);
						break;
					
					case 2:
						System.out.println("Enter balance to debit");
						long amountTobeDebited = Long.parseLong(MyBankUtility.readInputFromConsole());
						
						UserAccountService userAccountServiceForDebit  =UserAccountService.getInstance();
						userAccountServiceForDebit.debit(amountTobeDebited,loginRequest,choice);
						break;
					
					case 3:
						System.out.println("Transaction Details");
						
						UserAccountService userAccountServiceTransactionDetail  =UserAccountService.getInstance();
					    userAccountServiceTransactionDetail.transactionDetails(loginRequest,choice);
						break;
					
					default:
						throw new InvalidInputException("You Have Entered Wrong Choice");
					}
				}
				}
				
				break;

			default:
				System.out.println("Invalid Input");
			}

			System.out.println("Do you want to Continue ?YES/NO");
			ch = MyBankUtility.readInputFromConsole().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thank You");
	}
}
