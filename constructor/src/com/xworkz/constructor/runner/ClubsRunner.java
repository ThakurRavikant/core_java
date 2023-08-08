package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Clubs;

public class ClubsRunner {
public static void main(String args[]) {
	Clubs disco=new Clubs("Reedy Club",1000,"11:00PM","Addhar Card",true);
	if(disco!=null) {
		disco.display();
		System.out.println("The value of refernce are not equal");
	}
}
}
