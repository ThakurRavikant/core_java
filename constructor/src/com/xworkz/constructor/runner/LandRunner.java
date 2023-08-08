package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Land;

public class LandRunner {
public static void main(String args[]) {
	Land shyam=new Land("Mohan",250000,"hari","Indore","Rohit");
	if(shyam!=null) {
		shyam.display();	
		System.out.println("The address of reference are not equal");
	}
}
}
