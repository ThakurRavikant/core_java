package com.xworkz.constructor.things;

public class Hireact {
	public String ceo;
	public String headquarter;
	public int year;
	public int employees;
	public String revenue;
	
	public Hireact() {
		System.out.println("No-Argument constructor");
	}
	
	public Hireact(String ceo,String headquarter,int year,int employees,String revenue) {
		this.ceo=ceo;
		this.headquarter=headquarter;
		this.year=year;
		this.employees=employees;
		this.revenue=revenue;
	}
}
