package com.xworkz.abstractconcept.things;

public abstract class Paakashala {
	public String ownerName;
	public String estd;
	public int price;
	public boolean quality;

	public Paakashala() {
		System.out.println("No argument Constructor of Paakashala Class");
	}
	public Paakashala(String ownerName,String estd,int price,boolean quality) {
		System.out.println("All argument Constructor of Paakashala Class");
		this.ownerName=ownerName;
		this.estd=estd;
		this.price=price;
		this.quality=quality;
	}
	public void drink() {
		System.out.println("This is drink Method of Paakashala class");
	}
	public void service() {
		System.out.println("This is service Method of Paakashala class");
	}
	public void facilities() {
		System.out.println("This is facilities Method of Paakashala class");
	}
	public void foodService() {
		System.out.println("This is Food Service Method of Paakashala class");
	}
	public abstract void hireEmployee();
	public abstract void conductTraining();
	public abstract void evaluatePerformance();

}