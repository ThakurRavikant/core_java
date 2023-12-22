package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Research {
	public String name;
	public Date date;
	public Employee employee;
	public Lab lab;
	public Investor investor;
	
	 public Research() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Research(Employee employee,Lab lab,Investor investor) {
		System.out.println(" argument Constructor of Research Class");
		this.employee=employee;
		this.lab=lab;
		this.investor=investor;
	}
}
