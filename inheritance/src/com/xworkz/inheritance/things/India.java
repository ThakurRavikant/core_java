package com.xworkz.inheritance.things;

public class India extends Country {
	public int numberOfStates;
	public int numberOfDistric;
	
	
	public India() {
	System.out.println("No argument constructor");
	}
	
	public India( int numberOfStates,int numberOfDistric) {
	System.out.println("India All argument constructor");
	}

}
