package com.dalberry.utils;

import java.util.List;
import java.util.Scanner;

public class MyBankUtility {
    public static Scanner scanner=new Scanner(System.in);
	
     public static String readInputFromConsole() {
		//Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();

		//scanner.close();
		return userInput;
	}

	public static boolean checkAvailabilityOfCountry(String userdesireCountryName) {
		List<String> selectedCountries = ReadFromPropertyFile.getSelectedCountryList();
		for (Object country : selectedCountries) {
			if (country.equals(userdesireCountryName)) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}
}
