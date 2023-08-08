package com.xworkz.constructor.things;

public class Bazaar {
	public String marketName;
	public int numberOfShops;
	public String openTime;
	public String closeTime;
	public String location;
		
	public Bazaar() {
		System.out.println("The default value of constructor:");
	}
	public Bazaar(String marketName,int numberOfShops,String openTime, String closeTime,String location) {
		this.marketName=marketName;
		this.numberOfShops=numberOfShops;
		this.openTime=openTime;
		this.closeTime=closeTime;
		this.location=location;
		
	}
	public void display() {
		System.out.println("marketName:"+this.marketName+" "+"numberOfShops:"+this.numberOfShops+" "+"openTime:"+this.openTime+" "
				+"closeTime:"+this.closeTime+" "+"location:"+this.location);
	}
}
