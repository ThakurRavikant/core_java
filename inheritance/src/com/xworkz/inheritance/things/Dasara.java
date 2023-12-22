package com.xworkz.inheritance.things;

public class Dasara extends Festival{
	protected int numOfDay;
	protected String fastingFoods;
	protected int expenditure;
	protected String mela;
	
	public Dasara() {
		System.out.println("Default constructor of Dasara");
	}
	public Dasara(int numOfDay,String fastingFoods,int expenditure, String mela) {
		super("Karnataka","India","skyFirecracker",true);
		System.out.println("All Argument constructor of Dasara");
		this.numOfDay=numOfDay;
		this.fastingFoods=fastingFoods;
		this.expenditure=expenditure;
		this.mela=mela;
	
	}
	public void display() {
		System.out.println("This is display method of Dasara class");
	}
}
