package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Isro {
	public String name;
	public Date date;
	public Department department;
	public Research research;
	public Employee employee;
	public Lab lab;
	public Investor investor;
	public Machine Machine;
	
	
	public Isro() {
		// TODO Auto-generated constructor stub
	}
	
	public Isro(Department department, Research research,Employee employee, Lab lab,Investor investor) {
		System.out.println("argument Constructor of ISRO Class");
		this.department=department;
		this.research=research;
		this.employee=employee;
		this.lab=lab;
		this.investor=investor;
	}
	
	
	

}
