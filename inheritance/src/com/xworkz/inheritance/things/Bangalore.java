package com.xworkz.inheritance.things;

public class Bangalore extends Karnataka{
	public String typeOfCity;
	public String facilites;
	
	public Bangalore() {
		System.out.println("Bangalore No Argument Constructor");
	}
	public Bangalore(String typeOfCity, String facilites) {
		System.out.println("Bangalore All Argument Constructor");
	}
}
