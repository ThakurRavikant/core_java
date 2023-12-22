package com.xworkz.inheritance.things;

public class LinkedIn extends Application {
	public int numberOfcomp;
	public String user;
	public String emailId;
	public String subscriber;
	
	public LinkedIn() {
		System.out.println("No Argument Constructor");
	}
	public LinkedIn(int numberOfcomp,String user, String emailId,String subscriber) {
		System.out.println("All Argument Constructor");
		this.numberOfcomp=numberOfcomp;
		this.user=user;
		this.emailId=emailId;
		this.subscriber=subscriber;
		
	}
	

}
