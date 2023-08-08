package com.xworkz.constructor.runner;

public class Garbage {
	public String name;
	public String cityName;
	public int rent;
	public int worker;
	public boolean enviroment;

	public Garbage() {
		System.out.println("The default values is");
	}
	public Garbage(String name,String cityName,int rent,int worker,boolean enviroment) {
		this.name=name;
		this.cityName=cityName;
		this.rent=rent;
		this.worker=worker;
		this.enviroment=enviroment;
	}
	public void display() {
		System.out.println("name:"+this.name+" "+"cityName:"+this.cityName+" "+"rent:"+this.rent+" "
				+"worker:"+this.worker+" "+"enviroment:"+this.enviroment);
	}
}
