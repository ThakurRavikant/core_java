package com.xworkz.inheritance.things;

public class Holi extends Festival {
protected String type;
protected String colorUse;
protected String symbolized;
protected boolean enjoyment;

public Holi() {
	System.out.println("Default constructor of Holi");
}
public Holi(String type,String colorUse,String symbolized,boolean enjoyment) {
	System.out.println("Default constructor of Holi");
	this.type=type;
	this.colorUse=colorUse;
	this.symbolized=symbolized;
	this.enjoyment=enjoyment;
	
}
public void display() {
	System.out.println("This is display method of Holi class");
}
}
