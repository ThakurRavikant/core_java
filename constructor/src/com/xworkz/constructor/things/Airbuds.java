package com.xworkz.constructor.things;

public class Airbuds {
	public String brand;
	public String shopping;
	public int price;
	public String working;
	public boolean quality;
	
	public Airbuds() {
		System.out.println("The default value of constructor ");
	}
	public Airbuds(String brand,String shopping,int price,String working,boolean quality){
		this.brand=brand;
		this.shopping=shopping;
		this.price=price;
		this.working=working;
		this.quality=quality;
	}
	public void display() {
		System.out.println("brand:"+this.brand+" "+"shopping:"+this.shopping+" "+"price:"+this.price+" "
				+"working:"+this.working+" "+"quality:"+this.quality);
	}
}
