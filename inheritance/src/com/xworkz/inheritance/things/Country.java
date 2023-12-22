package com.xworkz.inheritance.things;

public class Country {
	public String numberOfPuplation;
	public int gst;
	public String area;
  
	public Country() {
		System.out.println("Country No Argument Constructor");
	}
	public Country(String numberOfPuplation,int gst, String area){
		System.out.println(" Country All Argument constructor");
		this.numberOfPuplation=numberOfPuplation;
		this.gst=gst;
		this.area=area;
		
	}
}
