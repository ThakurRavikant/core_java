package com.xworkz.inheritance.things;

public class Winter extends Weather {
	protected double averageTemperature;
	protected double snowfallAmount;
	protected String winterSports;
	protected float holidayDates;

	public Winter() {
		System.out.println("Default constructor of Winter");
	}
	public Winter( double averageTemperature,double snowfallAmount,String winterSports,float holidayDates) {
		System.out.println("All Arguments constructor of Winter");
		this.averageTemperature=averageTemperature;
		this.snowfallAmount=snowfallAmount;
		this.winterSports=winterSports;
		this.holidayDates=holidayDates;

	}
	public void display() {
		System.out.println("This is display method of Winter class");
	}
}
