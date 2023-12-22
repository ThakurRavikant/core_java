package com.xworkz.runner;

import com.xworkz.dto.CountryRepositoryImp;
import com.xworkz.repo.CountryRepository;

public class CountryRunner {
	public static void main(String[] args) {
		CountryRepository country = new CountryRepositoryImp();
		country.saveCount("Australia");
		country.saveCount("Germany");
		country.saveCount("China");
		country.saveCount("Canada");
		country.saveCount("Bangladesh");
		country.saveCount("Japan");
		country.saveCount("France");
		country.saveCount("Afghanisthan");
		country.saveCount("Denmark");
		country.saveCount("Belgium");
		country.saveCount("Greece");
		
		country.findEndsWith("ny");
		country.isExists("China");
		country.findReturnUpperCase("Japan");
		country.orderAscending();
		country.orderDescending();
		
		country.display();
		
	}

}

