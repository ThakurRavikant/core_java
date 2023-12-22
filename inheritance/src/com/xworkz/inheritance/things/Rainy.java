package com.xworkz.inheritance.things;

public class Rainy extends Weather{
	protected double rainfallAmount;
	protected int rainyDays;
	protected String rainIntensity;
	protected String rainyFoods;
	
	protected Rainy() {
	System.out.println("Default constructor of Rainy");
	}
	
	protected Rainy(double rainfallAmount,int rainyDays,String rainIntensity,String rainyFoods) {
		System.out.println("Default constructor of Rainy");
		this.rainfallAmount=rainfallAmount;
		this.rainyDays=rainyDays;
		this.rainIntensity=rainIntensity;
		this.rainyFoods=rainyFoods;
		
		
		}
	public void display() {
		System.out.println("This is display method of Rainy class");
	}
}

