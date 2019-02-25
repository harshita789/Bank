package com.dalberry.service;

import java.util.HashMap;

import com.dalberry.exception.IncorrectEmailOrPasswordException;
import com.dalberry.model.User;
import com.dalberry.model.UserAccount;
import com.dalberry.model.UserContactDetails;
import com.dalberry.model.UserIdentification;
import com.dalberry.model.UserMandatoryDetail;
import com.dalberry.model.UserQualification;
import com.dalberry.request.LoginRequest;
import com.dalberry.utils.Validator;

public class FetchUserDetails {
	
	
	public User fetchUserDetailsForRegistration() throws Exception {
		UserMandatoryDetail userMandatoryDetail = UserInputFromConsole.fetchUserMandatoryDetails();
		Validator.userMandatoryDetailValidation(userMandatoryDetail);

		UserContactDetails userContactDetails = UserInputFromConsole.fetchUserContactDetails();
		Validator.userContactDetailValidation(userContactDetails);

		UserQualification userQualification = UserInputFromConsole.fetchUserQualificationDetails();
		UserInputFromConsole.fetchUserBusinessDetails();

		UserIdentification userIdentification = UserInputFromConsole.fetchUserIdentification();

		UserAccount userAccount = UserInputFromConsole.fetchAccountDetail();
		
		
       
        
       HashMap<String,UserAccount>map=new HashMap<>();
   
       map.put(userAccount.getCurrency(), userAccount);
		
        User user = new User();
		
		user.setUserContactDetails(userContactDetails);
		user.setUserIdentification(userIdentification);
		user.setUserMandatoryDetail(userMandatoryDetail);
		user.setUserQualification(userQualification);
		user.setMap(map);
		
	
		
		UserMapInteraction.createAccount(user);
		
	    return user;
	}

	public  LoginRequest fetchUserDetailsForLogin() throws IncorrectEmailOrPasswordException  {
		LoginRequest loginRequest=UserInputFromConsole.fetchUserDetailForLogin();
		boolean b=UserMapInteraction.userLogin(loginRequest);
		if(b){
		return loginRequest ;
		}
		else{
			return null;
		}
		}

   }
