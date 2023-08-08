package com.xworkz.enumeration.things;


public class Battery {
	String name;
	int price;
	String mfgDate="06-04-2023";
	BatteryTypes types;
	
	public Battery() {
		System.out.println("No argument Constructor-Battery");
	}
	public Battery(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public Battery(String name,int price,String mfgDate,BatteryTypes type) {
		this.name=name;
		this.price=price;
		this.mfgDate=mfgDate;
		this.types=types;
	}
	public void setTypes(BatteryTypes types) {
		this.types=types;
		
	}
	public void display() {
		System.out.println(this.name=name);
		System.out.println(this.price=price);
		System.out.println(this.mfgDate=mfgDate);
		System.out.println(this.types=types);
	}

}
