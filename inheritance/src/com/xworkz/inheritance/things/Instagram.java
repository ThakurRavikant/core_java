package com.xworkz.inheritance.things;

public class Instagram extends Application {
	public String lunchDate;
	public int rating;
	public int num_user;
	public String ownerName;
	
		public Instagram() {
			System.out.println("No agrument constructor");
		
		}
		public Instagram(String lunchDate,int rating,int num_user,String ownerName) {
			System.out.println("No agrument constructor");
			this.lunchDate=lunchDate;
			this.rating=rating;
			this.num_user=num_user;
			this.ownerName=ownerName;
		
	}
		public void display() {
			System.out.println("this is display method");
		}
}

