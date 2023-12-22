package com.xworkz.inheritance.things;

public class KFC {
	String founderName;
	String estd;
	int numberOfBarnch;
	String menuIteams[]= {"Chicken-Lalipop","Dam Biryani","Hydrabad-Briyani","Kabab"};
	String profit;
	String rating;
	String openingTime;
	String clossingTime;
	int currentStaff;
	boolean isWifiAvailable;
	
	
	public KFC() {
		System.out.println("Default constructor of Kfc Class");
	}
	

	public void deliverOrder() {
		System.out.println("Deliverorder is method in KFC class" );
		
	}
	public void acceptOrder() {
		System.out.println("Acceptorder is method in KFC class" );
	}
	public void paymentRecieve() {
		System.out.println("Payment Recieved is method in KFC class" );	
	}
	public void offlineService() {
		System.out.println("Offline Service is method in KFC class" );	
	}
	public void onlineService() {
		System.out.println("Online service is method in KFC class" );	
	}
	public void cooking() {
		System.out.println("Cooking is method in KFC class" );	
	}
	public void eating() {
		System.out.println("Eating is method in KFC class" );		
	}
	public void dinking() {
		System.out.println("Drinking is method in KFC class" );		
	}
	public void washing() {
		System.out.println("Washing is method in KFC class" );		
	}
	public void removeOrder() {
		System.out.println("Remove Order is method in KFC class" );	
	}
}
