package com.xworkz.inheritance.things;

public class KFC1 extends KFC {

	@Override
	public	void deliverOrder() {
		System.out.println("Deliverorder is method in KFC1 class" );

	}
	@Override
	public void acceptOrder() {
		System.out.println("Acceptorder is method in KFC1 class" );
	}
	@Override
	public void paymentRecieve() {
		System.out.println("Payment Recieved is method in KFC1 class" );	
	}
	@Override
	public void offlineService() {
		System.out.println("Offline Service is method in KFC1 class" );	
	}
	@Override
	public void onlineService() {
		System.out.println("Online service is method in KFC1 class" );	
	}
	@Override
	public void cooking() {
		System.out.println("Cooking is method in KFC1 class" );	
	}
	@Override
	public void eating() {
		System.out.println("Eating is method in KFC1 class" );		
	}
	@Override
	public void dinking() {
		System.out.println("Drinking is method in KFC1 class" );		
	}
	@Override
	public void washing() {
		System.out.println("Washing is method in KFC1 class" );		
	}
	@Override
	public void removeOrder() {
		System.out.println("Remove Order is method in KFC1 class" );	
	}
}


