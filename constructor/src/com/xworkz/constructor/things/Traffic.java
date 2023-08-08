package com.xworkz.constructor.things;

public class Traffic {
public String location;
public String area;
public int  numberOfcars;
public int  numberOfBuses;
public int numberOfBikes;
public String highwayname;
public boolean noise;
public String trafficOfficer;
public int  numberOfPolice;

public Traffic(String location,String area,int  numberOfcars,int  numberOfBuses, int numberOfBikes, String highwayname, boolean noise,String trafficOfficer,int  numberOfPolice) {
	this.location=location;
	this.area=area;
	this.numberOfcars=numberOfcars;
	this.numberOfBuses=numberOfBuses;
	this.numberOfBikes=numberOfBikes;
	this.highwayname=highwayname;
	this.noise=noise;
	this.trafficOfficer=trafficOfficer;
	this.numberOfPolice=numberOfPolice;
}
	
	public void display() {
		System.out.println("locatin is:"+this.location);
		System.out.println("area is:"+this.area);
		System.out.println("Number of cars is:"+this.numberOfcars);
		System.out.println("numberOfBuses is:"+this.numberOfBuses);
		System.out.println("numberOfBikes is:"+this.numberOfBikes);
		System.out.println("highwayname is:"+this.highwayname);
		System.out.println("noise is:"+this.noise);
		System.out.println("trafficOfficer is:"+this.trafficOfficer);
		System.out.println("numberOfPolice is:"+this.numberOfPolice);
		
}
}

