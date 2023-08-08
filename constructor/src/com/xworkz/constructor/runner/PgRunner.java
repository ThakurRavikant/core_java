package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Pg;

public class PgRunner {
public static void main(String args[]) {
	Pg teja=new Pg();
	
	int priceOfRoom[]= {5000,5500,6000};
	Pg teja1=new Pg(priceOfRoom);
	
	int priceOfRoom1[]= {5000,5500,6000};
	String guestname[]= {"Rohit","Mohan","Reddy"};
	Pg teja2=new Pg(priceOfRoom1,guestname);
	
	int priceOfRoom2[]= {5000,5500,6000};
	String guestname1[]= {"Rohit","Mohan","Reddy"};
	String guestages[]= {"25yrs","28yrs","30yrs"};
	Pg teja3=new Pg(priceOfRoom2,guestname1,guestages);
	
	 String pgName="Sai Teja Pg";
	 Pg teja4=new Pg(pgName);
	 teja4.displayPg();
	 
	 String location="Btm Layout";
	 Pg teja5=new Pg(pgName,location);
	 teja5.displayPg();
	 
	 String ownerName="Rohit Sheety";
	 Pg teja6=new Pg(pgName,location,ownerName);
	 teja6.displayPg();
	 
	 String pgName1="Sai Teja Pg";
	 int priceOfRoom3[]= {5000,5500,6000};
	 Pg teja7=new Pg(pgName1,priceOfRoom3);
	 teja7.displayPg();
	 
	 String pgName2="Sai Teja Pg";
	 String location1="Btm Layout";
	 String ownerName1="Rohit Sheety";
	 String guestname2[]= {"Rohit","Mohan","Reddy"};
	 Pg teja8=new Pg(pgName2,location1,ownerName1,guestname2);
	 teja8.displayPg();
	 
	 String pgName3="Sai Teja Pg";
	 String location2="Btm Layout";
	 String ownerName2="Rohit Sheety";
	 int priceOfRoom4[]= {5000,5500,6000};
	 String guestname3[]= {"Rohit","Mohan","Reddy"};
	 String guestages3[]= {"25yrs","28yrs","30yrs"};
	 Pg teja9=new Pg(pgName3,location2,ownerName2,priceOfRoom4,guestname3,guestages3);
	 teja9.displayPg();
}
}