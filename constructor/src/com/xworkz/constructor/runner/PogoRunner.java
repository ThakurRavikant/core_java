package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Pogo;

public class PogoRunner {
public static void main(String args[]) {
	Pogo tvchannel=new Pogo();
	//tvchannel.message();
	//tvchannel.entertainment();
	tvchannel.setType("Tv Channel");
	tvchannel.setShows("cartoon");
	tvchannel.setLunchDate("20 August2010");
	tvchannel.setFounder("Jone Harry");
	tvchannel.setNumberOfShows(100);
	tvchannel.setViwer(1000000);
	tvchannel.setCharge(5000);
	tvchannel.setService(true);
	tvchannel.setSuscribers("4 Million");
	tvchannel.setLoss(20000000);
	
	System.out.println(tvchannel.getType());
	System.out.println(tvchannel.getShows());
	System.out.println(tvchannel.getLunchDate());
	System.out.println(tvchannel.getFounder());
	System.out.println(tvchannel.getNumberOfShows());
	System.out.println(tvchannel.getViwer());
	System.out.println(tvchannel.getCharge());
	System.out.println(tvchannel.getService());
	System.out.println(tvchannel.getSuscribers());
	System.out.println(tvchannel.getLoss());
	
	tvchannel.display();
}
}
