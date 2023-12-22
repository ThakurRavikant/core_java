package com.xworkz.inheritance.things;

public class Karnataka extends India{
	public String localLanguage;
	public String capitalCity;

	public Karnataka() {
		System.out.println("Karnataka No Argument Constructor");
	}
	public Karnataka(String localLanguage, String capitalCity) {
		System.out.println("Karnataka All Argument Constructor");
	}


}
