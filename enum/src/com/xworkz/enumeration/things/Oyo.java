package com.xworkz.enumeration.things;


public class Oyo {
	String hotelName;
	String location;
	String ownerName="Rohit";
	OyoRoomType roomType;
	
	public Oyo() {
		System.out.println("No argument Constructor-Oyo");
	}
	public Oyo(String hotelName,String location) {
		
		this.hotelName=hotelName;
		this.location=location;
		
	}
	/*public Oyo(String hotelName,String location,String ownerName,OyoRoomType roomType) {
		this("Thor","Whitefield");
		this.hotelName=hotelName;
		this.location=location;
		this.ownerName=ownerName;
		this.roomType=roomType;
		
	}*/
	public void setRoomType(OyoRoomType roomType) {
		this.roomType=roomType;
	}
	public void display() {
		System.out.println(this.hotelName=hotelName);
		System.out.println(this.location=location);
		System.out.println(this.ownerName=ownerName);
		System.out.println(this.roomType=roomType);
	}

}
