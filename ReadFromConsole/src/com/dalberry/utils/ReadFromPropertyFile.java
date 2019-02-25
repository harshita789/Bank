package com.dalberry.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromPropertyFile {
	private static List<String> allCountries = new ArrayList<>();
	private static List<String> selectedCountries = new ArrayList<>();
	private static List<String> currency = new ArrayList<>();
	private static List<String> idProof = new ArrayList<>();

	private ReadFromPropertyFile() {
	}

	public static void populateMasterData() throws IOException {
		ReadFromPropertyFile.populateCountryList();
		ReadFromPropertyFile.populateSelectedCountryList();
		ReadFromPropertyFile.populateIdentityProofAcceptedList();
		ReadFromPropertyFile.populateCurrencyList();

	}

	private static void populateCountryList() throws IOException {
		File f = new File("list.country");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String readLine = "";

		while ((readLine = b.readLine()) != null) {
			allCountries.add(readLine);
		}
		b.close();
	}

	public static List<String> getAllCountriesList() {
		return allCountries;
	}

	private static void populateCurrencyList() throws IOException {
		File f = new File("list.Currency");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String readLine = "";

		while ((readLine = b.readLine()) != null) {
			// countries=new ArrayList<>();
			currency.add(readLine);
		}
		b.close();
	}

	public static List<String> getAllCurrencyList() {
		return currency;

	}

	private static void populateSelectedCountryList() throws IOException {
		File f = new File("list.selectedCountry");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String readLine = "";

		while ((readLine = b.readLine()) != null) {
			// countries=new ArrayList<>();
			selectedCountries.add(readLine);
		}
		b.close();
	}

	public static List<String> getSelectedCountryList() {
		return selectedCountries;

	}

	private static void populateIdentityProofAcceptedList() throws IOException {
		File f = new File("list.identityproofAccepted");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String readLine = "";

		while ((readLine = b.readLine()) != null) {
			// countries=new ArrayList<>();
			idProof.add(readLine);
		}
		b.close();
	}

	public static List<String> getIdProofAcceptedList() {
		return idProof;

	}
}
