package com.xworkz.constructor.things;

public class Clubs {
public String clubsdName;
public int ticketPrice;
public String time;
public String proof;
public boolean status;
	
public Clubs() {
	System.out.println("The defalut value of Constructor");
}
public Clubs(String clubsdName,int ticketPrice,String time,String proof,boolean status) {
	this.clubsdName=clubsdName;
	this.ticketPrice=ticketPrice;
	this.time=time;
	this.proof=proof;
	this.status=status;
}
public void display() {
	System.out.println("clubsdName:"+this.clubsdName+" "+"ticketPrice:"+this.ticketPrice+" "+"time:"+this.time+" "
				+"proof:"+this.proof+" "+"status:"+this.status);
}
}
