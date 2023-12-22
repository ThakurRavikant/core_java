package com.xworkz.inheritance.things;

public class Summer extends Weather {
	protected String monthName;
	protected String duration;
	protected String vacationSpots;
	protected String activities;

	public Summer() {
		System.out.println("Default Constructor of Summer");
	}
	public Summer(String monthName,String duration,String vacationSpots,String activities) {
		System.out.println("All Argument Constructor of Summer");
		this.monthName=monthName;
		this.duration=duration;
		this.vacationSpots=vacationSpots;
		this.activities=activities;


	}
	public void display() {
		System.out.println("This is display method of Summer class");
	}
}
