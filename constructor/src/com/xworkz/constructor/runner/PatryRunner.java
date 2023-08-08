package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Party;

public class PatryRunner {
public static void main(String args[]) {
	Party clubs=new Party();
	//clubs.dance();
	//clubs.music();
	clubs.setType("Marriage Ceremony");
	clubs.setNumberOfGuest(1520000);
	clubs.setTypesOfFood("Non veg");
	clubs.setNumberOfLadies("1000L");
	clubs.setNumberOfBoys(1000);
	clubs.setTime("8:00PM");
	clubs.setLocation("BTM Layout");
	clubs.setService(true);
	clubs.setArea("Mico Layout");
	clubs.setOrganizedBy("Shetty Family");
	
	System.out.println(clubs.getType());
	System.out.println(clubs.getNumberOfGuest());
	System.out.println(clubs.getTypesOfFood());
	System.out.println(clubs.getNumberOfLadies());
	System.out.println(clubs.getNumberOfBoys());
	System.out.println(clubs.gettime());
	System.out.println(clubs.getLocation());
	System.out.println(clubs.getService());
	System.out.println(clubs.getArea());
	System.out.println(clubs.getOrganizedBy());
	
	clubs.display();
	
}
}
