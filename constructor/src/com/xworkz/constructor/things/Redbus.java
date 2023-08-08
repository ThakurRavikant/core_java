package com.xworkz.constructor.things;

public class Redbus {
	public int numberOfBuses=250;
	public int numberOfDriver=500;
	public int numberOfContractor=140;
	public int ticket=580;
	public boolean service=true;
	public String passangerName="Rohit";
	public int acBus=200;
	public int nonAcBus=250;
	public String route="Banglore to Mysore";
	public String timing="10AM";
	
	public Redbus() {
		System.out.println("constructor with no argument");
	}
	
	public Redbus(int numberOfBuses,int numberOfDriver,int numberOfContractor,int ticket,boolean service,String passangerName,int acBus,int nonAcBus,String route,String timing) {
		System.out.println("All argument");
		this.numberOfBuses=numberOfBuses;
		this.numberOfDriver=numberOfDriver;
		this.numberOfContractor=numberOfContractor;
		this.ticket=ticket;
		this.service=service;
		this.passangerName=passangerName;
		this.acBus=acBus;
		this.nonAcBus=nonAcBus;
		this.route=route;
		this.timing=timing;
	}
}
