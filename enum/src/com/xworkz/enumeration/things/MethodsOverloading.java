package com.xworkz.enumeration.things;

public class MethodsOverloading {
	String name;
	String Id;
	String location;
	
	public void play(String name) {
	this.name=name;
		System.out.println("this play method 1 argument");
	}
	
	public void play(String name,String Id) {
		this.name=name;
		this.Id=Id;
		
		System.out.println("this play method 2 argument");
	}

	public void play(String name,String Id,String location) {
		this.name=name;
		this.Id=Id;
		this.location=location;
		System.out.println("this play method 3 argument");
	}
}
