package com.xworkz.inheritance.things;

public class Sunny extends Weather {
	protected double avgTemp;
	protected String airCondition;
	protected String sunnyCroops;
	protected String endSunnySeasionDate;
	
	
	public Sunny() {
		System.out.println("Default constructor of Sunny");
	}
	public Sunny(double avgTemp,String airCondition,String sunnyCroops,String endSunnySeasionDate) {
		System.out.println("Default constructor of Sunny");
		this.avgTemp=avgTemp;
		this.airCondition=airCondition;
		this.sunnyCroops=sunnyCroops;
		this.endSunnySeasionDate=endSunnySeasionDate;
	
		
	}
	public void display() {
		System.out.println("This is display method of Sunny class");
	}
}
