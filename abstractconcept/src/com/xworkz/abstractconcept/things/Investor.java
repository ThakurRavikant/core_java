package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Investor {
	public String name;
	public Date date;
	public Machine machine;

	public Investor() {
		// TODO Auto-generated constructor stub
	}	

	public Investor(Machine machine) {
		System.out.println("No argument Constructor of Investor Class");

		this.machine=machine;
	}
}
