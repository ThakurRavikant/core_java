package com.xworkz.enumeration.things;


public class Theater {
	String name;
	String location;
	String estd="06-01-1999";
	TheaterClasses classes;
	TheaterTypes types;
	
	public Theater() {
		System.out.println("No Argument constructor-Theater");
	}
	public Theater(String name,String location) {
		super();
		this.name=name;
		this.location=location;
		
	}
	public Theater(String name,String location,String estd,TheaterClasses classes,TheaterTypes types) {
		this("X-tarzen","BTM");
		this.name=name;
		this.location=location;
		this.estd=estd;
		this.classes=classes;
		this.types=types;
		
		
	}
	
	public void setClasses(TheaterClasses classes) {
		this.classes=classes;
		
	}
	
	public void setType(TheaterTypes types) {
		this.types=types;
		
	}
	public void display() {
		System.out.println(this.name=name);
		System.out.println(this.location=location);
		System.out.println(this.estd=estd);
		System.out.println(this.classes=classes);
		System.out.println(this.types=types);
	}
	

}
