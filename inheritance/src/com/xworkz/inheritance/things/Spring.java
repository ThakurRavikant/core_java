package com.xworkz.inheritance.things;

public class Spring extends Weather {
	protected double averageWinterTemperature;
	protected double snowfallAmount;
	protected String winterActivities;
	protected String holidayWinterDates;
	
	public Spring() {
		System.out.println("Default constructor of Spring");
	}
	
	public Spring( double averageWinterTemperature,double snowfallAmount,String winterActivities,String holidayWinterDates) {
		System.out.println("Default constructor of Spring");
		this.averageWinterTemperature=averageWinterTemperature;
		this.snowfallAmount=snowfallAmount;
		this.winterActivities=winterActivities;
		this.holidayWinterDates=holidayWinterDates;
		
	}
	
	public void display() {
		System.out.println("This is display method of Spring class");
	}
}
