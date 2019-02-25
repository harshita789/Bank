package com.dalberry.utils;

import com.dalberry.exception.InvalidInputException;
import com.dalberry.model.UserContactDetails;
import com.dalberry.model.UserMandatoryDetail;

public class Validator {

	public static void userMandatoryDetailValidation(UserMandatoryDetail userMandatoryDetail)
			throws InvalidInputException {

		if (userMandatoryDetail.getUserName() == null || userMandatoryDetail.getUserName().isEmpty()) {
			throw new InvalidInputException("UserName Missing");
		} else if (userMandatoryDetail.getPassword() == null || userMandatoryDetail.getPassword().isEmpty()
				|| userMandatoryDetail.getPassword().length() < 4) {
			throw new InvalidInputException("Password Missing");
		} else if (userMandatoryDetail.getCity() == null || userMandatoryDetail.getCity().isEmpty()) {
			throw new InvalidInputException("City Missing");
		} else if (userMandatoryDetail.getEmail() == null || userMandatoryDetail.getEmail().isEmpty()) {
			throw new InvalidInputException("Email Missing");
		} else if (userMandatoryDetail.getAge() <= 0) {
			throw new InvalidInputException("Age Can Not Be Negative");
		}
	}

	public static void userContactDetailValidation(UserContactDetails userContactDetails) throws InvalidInputException {
		if (userContactDetails.getCurrentAddress() == null || userContactDetails.getCurrentAddress().isEmpty()) {
			throw new InvalidInputException("Current Address Missing");
		} else if (userContactDetails.getParmanenetAddress() == null
				|| userContactDetails.getParmanenetAddress().isEmpty()) {
			throw new InvalidInputException("Parmanent Address Missing");
		} else if (userContactDetails.getMobileNo() == null || userContactDetails.getMobileNo().isEmpty()||userContactDetails.getMobileNo().length()!=10) {
			throw new InvalidInputException("Mobile No Missing");
		} else if (userContactDetails.getUserCountry() == null || userContactDetails.getUserCountry().isEmpty()) {
			throw new InvalidInputException("Country Missing");

		}
	}
}
