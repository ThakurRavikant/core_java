package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Amazon;

public class AmazonRunner {
	public static void main(String args[]) {
		Amazon user=new Amazon();
		//user.advertersing(); // calling by reference 
		//user.earn();
		user.setFounder("Jeff Bezos");
		user.setType("Online Shopping ");
		user.setNumberOfEmploye(100000);
		user.setRevenue("10 Million");
		user.setNumberOfProduct(1000000);
		user.setProfit(15000000.02f);
		user.setNumberOfBrands(100000);
		user.setService(true);
		user.setSuscribers("150 Million");
		user.setLoss(70000000);
		
		String founder=user.getFounder();
		System.out.println(founder);
		String type=user.getType();
		System.out.println(type);
		
		
		
		System.out.println(user.getFounder());
		System.out.println(user.getType());
		System.out.println(user.getNumberOfEmploye());
		System.out.println(user.getRevenue());
		System.out.println(user.getNumberOfProduct());
		System.out.println(user.getProfit());
		System.out.println(user.getNumberOfBrands());
		System.out.println(user.getService());
		System.out.println(user.getSuscribers());
		System.out.println(user.getLoss());
		
		user.display();
	}
	

}
