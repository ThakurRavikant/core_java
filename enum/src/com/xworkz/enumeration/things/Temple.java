package com.xworkz.enumeration.things;


public class Temple {
	 String openingTime;
	 String closingTime;
	 TempleLocation location;
	 String templeName="Kedarnath";
	 TempleWay way;
	 
	 public Temple() {
		System.out.println("No argument constructor-Temple");
	}
	 public Temple(String openingTime, String closingTime) {
		 super();
			this.openingTime=openingTime;
			this.closingTime=closingTime;
		}
	 
	  public Temple(String openingTime, String closingTime, TempleLocation location ,String templeName, TempleWay way) {
		this("6:00AM","8:00PM");
		this.openingTime=openingTime;
		this.closingTime=closingTime;
		this.location=location;
		this.templeName=templeName;
		this.way=way;
		
	}
	 public void setLocation(TempleLocation location) {
		  this.location=location;
		 
		 
		  
	  }
	  void setWay(TempleWay way) {
		  this.way=way;
	  }
	  void display() {
		  System.out.println(this.openingTime);
		  System.out.println(this.closingTime);
		  System.out.println(this.location);
		  System.out.println(this.templeName);
		  System.out.println(this.way);
	  }
	 
	}



