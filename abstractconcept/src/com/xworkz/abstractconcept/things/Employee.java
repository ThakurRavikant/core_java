package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Employee {
	public String name;
	public Date date;
	public Lab lab;
	public Investor investor;
	public Machine machine;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Lab lab,Investor investor) {
		System.out.println("No argument Constructor of Employee Class");
		this.lab=lab;
		this.investor=investor;
		
	}

}
