package com.xworkz.constructor.things;

public class Pg {
	public int priceOfRoom[];
	public String guestname[];
	public String guestages[];
	public String pgName;
	public String location;
	public String ownerName;
	
	public Pg() {
		System.out.println("A constructor with no argument");
	}
	
	public Pg( int priceOfRoom[]) {
		System.out.println("1 array argument constructor");
		this.priceOfRoom=priceOfRoom;
		for(int i=0; i<priceOfRoom.length; i++) {
			System.out.println("priceOfRoom:"+priceOfRoom[i]);
		}
	}
	public Pg( int priceOfRoom[],String guestname[]) {
		System.out.println("2 Array argument constructor");
		this.priceOfRoom=priceOfRoom;
		for(int i=0; i<priceOfRoom.length; i++) {
			System.out.println("priceOfRoom:"+priceOfRoom[i]);
		}
			this.guestname=guestname;
			for(int i=0; i<guestname.length; i++) {
				System.out.println("guestname:"+guestname[i]);
		}
	}
	public Pg(int priceOfRoom[], String guestname[], String guestages[]) {
		System.out.println("3 Array argument constructor");
		this.priceOfRoom=priceOfRoom;
		for(int i=0; i<priceOfRoom.length; i++) {
			System.out.println("priceOfRoom:"+priceOfRoom[i]);
		}
			this.guestname=guestname;
			for(int i=0; i<guestname.length; i++) {
				System.out.println("guestname:"+guestname[i]);
		}
			this.guestages=guestages;
			for(int i=0; i<guestages.length; i++) {
				System.out.println("guestages:"+guestages[i]);	
			}
	}
	public Pg(String pgName) {
		System.out.println("1 Argument Constructor");
		this.pgName=pgName;
	}
	public Pg(String pgName, String location) {
		System.out.println("2 Argument Constructor");
		this.location=location;
	}
	public Pg(String pgName, String location,String ownerName) {
		System.out.println("3 Argument Constructor");
		this.ownerName=ownerName;
	}
	public Pg(String pgName,int priceOfRoom[]) {
		this.pgName=pgName;
		for(int i=0; i<priceOfRoom.length; i++) {
			System.out.println("Players Name are:"+priceOfRoom[i]);
		}
		this.priceOfRoom=priceOfRoom;
	}
	public Pg(String pgName, String location,String ownerName, String guestname[]) {
	System.out.println(" Constructor with 3 argument and 1 array");
	this.pgName=pgName;
	this.location=location;
	this.ownerName=ownerName;
	this.guestname=guestname;
		for(int i=0; i<guestname.length; i++) {
		System.out.println("guestname:"+guestname[i]);
		}
	}
	public Pg( String pgName, String location,String ownerName,int priceOfRoom[], String guestname[], String guestages[]) {
		System.out.println("Constructor with all argument ");
		this.pgName=pgName;
		this.location=location;
		this.ownerName=ownerName;
	
		
		this.priceOfRoom=priceOfRoom;
		for(int i=0; i<priceOfRoom.length; i++) {
			System.out.println("priceOfRoom:"+priceOfRoom[i]);
		}
			this.guestname=guestname;
			for(int i=0; i<guestname.length; i++) {
				System.out.println("guestname:"+guestname[i]);
		}
			this.guestages=guestages;
			for(int i=0; i<guestages.length; i++) {
				System.out.println("guestages:"+guestages[i]);	
			}
	}
	public void displayPg() {
		System.out.println("PG Name is:"+this.pgName);
		System.out.println("PG location is:"+this.location);
		System.out.println("PG ownerName is:"+this.ownerName);
		System.out.println("PG priceOfRoom is:"+this.priceOfRoom);
		System.out.println("PG guestname is:"+this.guestname);
		System.out.println("PG guestages is:"+this.guestages);
	}
}


