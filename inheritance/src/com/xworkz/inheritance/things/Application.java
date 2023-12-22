package com.xworkz.inheritance.things;

public class Application {
	public String types;
	public String name;
	public String estd_years;
	public String date;
	public int num_Iteams;
	public String iteamName;
	public int price;
	public String username;
	public String numOfApplication;

	public Application() {
		System.out.println("Application no argument constructor");
	}
	public Application(String types,String name,String estd_years, String date,int num_Iteams,String iteamName,int price, String username,String numOfApplication) {
		System.out.println("Application All argument constructor");
		this.types=types;
		this.name=name;
		this.estd_years=estd_years;
		this.date=date;
		this.num_Iteams=num_Iteams;
		this.iteamName=iteamName;
		this.price=price;
		this.username=username;
		this.numOfApplication=numOfApplication;
		
	}
	public void logIn() {
		System.out.println("logIn method");
	}
	public void logOut() {
		System.out.println("logOut method");
	}
	public void use() {
		System.out.println("use method");
	}
	public void display() {
		System.out.println("This is display method");
	}
	
}
