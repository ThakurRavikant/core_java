package com.xworkz.constructor.things;

public class Party {
	private String type;
	private int numberOfGuest;
	private String typesOfFood;
	private String numberOfLadies;
	private int numberOfBoys;
	private String  time;
	private String location;
	private boolean service;
	private String area;
	private String organizedBy;
	
	public Party() {
		System.out.println("Default constructor");
	}
	public Party(String type,int numberOfGuest,String typesOfFood,String numberOfLadies,int numberOfBoys,String  time, 
			String location,boolean service, String area, String organizedBy) {
		this.type=type;
		this.numberOfGuest=numberOfGuest;
		this.typesOfFood=typesOfFood;
		this.numberOfLadies=numberOfLadies;
		this.numberOfBoys=numberOfBoys;
		this.time=time;
		this.location=location;
		this.service=service;
		this.area=area;
		this.organizedBy=organizedBy;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
	return type;
	}
	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest=numberOfGuest;
	}
	public int getNumberOfGuest() {
	return numberOfGuest;
	}
	public void setTypesOfFood(String typesOfFood) {
		this.typesOfFood=typesOfFood;
	}
	public String getTypesOfFood() {
		return typesOfFood;
	}
	public void setNumberOfLadies( String numberOfLadies) {
		this.numberOfLadies=numberOfLadies;
	}
	public String getNumberOfLadies() {
		return numberOfLadies;
	}
	public void setNumberOfBoys( int numberOfBoys) {
		this.numberOfBoys=numberOfBoys;
	}
	public int getNumberOfBoys() {
		return numberOfBoys;
	}
	
	public void setTime( String time) {
		this.time=time;
	}
	public String gettime() {
		return time;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setService( boolean service) {
		this.service=service;
	}
	public boolean getService() {
		return service;
	}
	public void setArea(String area) {
		this.area=area;
	}
	public String getArea() {
		return area;
	}
	public void setOrganizedBy(String organizedBy) {
		this.organizedBy=organizedBy;
	}
	public String getOrganizedBy() {
		return organizedBy;
	}
	public void display() {
		System.out.println("Type of party is:"+this.type);
		System.out.println("Number of guest in party is:"+this.numberOfGuest);
		System.out.println("Types of food in party is:"+this.typesOfFood);
		System.out.println("Number of ladies are :"+this.numberOfLadies);
		System.out.println("Number of boys are:"+this.numberOfBoys);
		System.out.println("Time of party start is:"+this.time);
		System.out.println("Location of party is:"+this.location);
		System.out.println("Service on party is:"+this.service);
		System.out.println("Area is:"+this.area);
		System.out.println("Party organized by:"+this.organizedBy);
	}
	
	/*public void service() {
		System.out.println("service");
	}
	public void music() {
		System.out.println("service");
	}
	public void foods() {
		System.out.println("service");
	}
	public void taking() {
		System.out.println("service");
	}
	public void dance() {
		System.out.println("service");
	}
	*/
}
