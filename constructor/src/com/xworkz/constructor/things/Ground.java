package com.xworkz.constructor.things;

public class Ground {
	public String name;
	public String location;
	public int area;
	public int numberOfPlayground;
	public boolean environment;
	
	public Ground() {
		System.out.println("The default value of constructor:");
	}
	public Ground(String name,String location,int area,int numberOfPlayground,boolean environment) {
		this.name=name;
		this.location=location;
		this.area=area;
		this.numberOfPlayground=numberOfPlayground;
		this.environment=environment;
	}
	public void display() {
		System.out.println("name:"+this.name+" "+"location:"+this.location+" "+"area:"+this.area+" "
				+"numberOfPlayground:"+this.numberOfPlayground+" "+"environment:"+this.environment);
	}
}
