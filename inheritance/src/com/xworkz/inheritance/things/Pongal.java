package com.xworkz.inheritance.things;

public class Pongal extends Festival {
	protected String pongalDate;
	protected String pongalDay;
	protected String pongalFoods;
	protected String ritualsPerformed;

	public Pongal() {
		System.out.println("Default Constructor of Pongal");
	}
	public Pongal(String pongalDate,String pongalDay,String pongalFoods,String ritualsPerformed) {
		System.out.println("Default Constructor of Pongal");
		this.pongalDate=pongalDate;
		this.pongalDay=pongalDay;
		this.pongalFoods=pongalFoods;
		this.ritualsPerformed=ritualsPerformed;

	}
	public void display() {
		System.out.println("This is display method of Pongal class");
	}
}
