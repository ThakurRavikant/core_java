package com.xworkz.inheritance.things;

public class Diwali extends Festival{
	protected String states;
	protected String countryName;
	protected String fireCracker;
	protected boolean lighting;
	
	public Diwali() {
		System.out.println("Default constructor of Diwali");
	}
	public Diwali(String states,String countryName,String fireCracker,boolean lighting) {
		System.out.println("All Arguments constructor of Diwali");
		this.states=states;
		this.countryName=countryName;
		this.fireCracker=fireCracker;
		this.lighting=lighting;
	//	System.out.println("states:"+this.states+" "+"countryName:"+this.countryName+" "+"fireCracker:"+this.fireCracker+" "+"lighting:"+this.lighting);
		
		
	}
	public void display() {
		System.out.println("This is display method of Diwali class");
	}
}
