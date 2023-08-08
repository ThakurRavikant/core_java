package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Redbus;

public class RedbusRunner {
	public static void main(String args[]) {
	Redbus btmc=new Redbus();
	 System.out.println("Number Of Buses are:"+btmc.numberOfBuses);
	 System.out.println("Number Of Driver are:"+btmc.numberOfDriver);
	 System.out.println("Number Of Contractor are:"+btmc.numberOfContractor);
	 System.out.println("Price  of Tickets is:"+btmc.ticket);
	 System.out.println("service is:"+btmc.service);
	 System.out.println("Passanger Name is:"+btmc.passangerName);
	 System.out.println("Number of AC bus are:"+btmc.acBus);
	 System.out.println("Number of Non AC bus are:"+btmc.nonAcBus);
	 System.out.println("Buses route is:"+btmc.route);
	 System.out.println("Buses timing is:"+btmc.timing);
	 
	 Redbus btmc1=new Redbus(250,500,140,580,true,"Rohit",200,250,"Banglore to Mysore","10AM");
		 
	 System.out.println("Number Of Buses are:"+btmc1.numberOfBuses);
	 System.out.println("Number Of Driver are:"+btmc1.numberOfDriver);
	 System.out.println("Number Of Contractor are:"+btmc1.numberOfContractor);
	 System.out.println("Price  of Tickets is:"+btmc1.ticket);
	 System.out.println("service is:"+btmc1.service);
	 System.out.println("Passanger Name is:"+btmc1.passangerName);
	 System.out.println("Number of AC bus are:"+btmc1.acBus);
	 System.out.println("Number of Non AC bus are:"+btmc1.nonAcBus);
	 System.out.println("Buses route is:"+btmc1.route);
	 System.out.println("Buses timing is:"+btmc1.timing);
}
}