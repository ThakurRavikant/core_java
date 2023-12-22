package com.xworkz.abstractconcept.things;

import java.util.Date;

public class Lab {
	public String name;
	public Date date;
	public Investor investor;
	public Machine Machine;


	public Lab() {
		// TODO Auto-generated constructor stub
	}	

	public Lab(Investor investor) {
		System.out.println("argument Constructor of Lab Class");
		this.investor=investor;
//		this.Machine=machine;

	}	

}
