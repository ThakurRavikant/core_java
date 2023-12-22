package com.xworkz.inheritance.things;

public class Nepal extends Country {
	public String language;
	public int literacyRate;
	
	public Nepal() {
	System.out.println(" Nepal No Argument constructor");
	}
	public Nepal(String language,int literacyRate) {
		System.out.println("Nepal All Argument constructor");
		}

}
