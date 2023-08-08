package com.xworkz.enumeration.things;


public class Director {
	String name;
	String address;
	int numOfMovie=10;
	String rating;

	public Director(String name,String address,int numOfMovie,String rating) {
		System.out.println("Invoking Constructor of Director class");
		this.name=name;
		this.address=address;
		this.numOfMovie=numOfMovie;
		this.rating=rating;


	}
	void setAddress(String address) {
		System.out.println("Invoking Method of Director class");
		this.address=address;

	}
	void print_InfoDirector() {
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.address);
		System.out.println("Number of Movie:"+this.numOfMovie);
		System.out.println("Rating:"+this.rating);
	}
}
