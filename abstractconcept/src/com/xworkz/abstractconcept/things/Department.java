package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Department {
	public String name;
	public Date date;
	public Research research;
	public Employee employee;
	public Lab lab;
	public Investor investor;
	public Machine Machine;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(Research research,Employee employee, Lab lab,Investor investor) {
		System.out.println(" argument Constructor of Department Class");
		this.research=research;
		this.employee=employee;
		this.lab=lab;
		this.investor=investor;
	}
}
