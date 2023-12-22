package com.xworkz.inheritance.things;

public class Chennai extends TamilNadu {
	public String nameOfCM;
	public int numOfparties;
	
	public Chennai() {
		System.out.println("Chennai No Argument Constructor");
	}
	public Chennai(String nameOfCM, int numOfparties) {
		System.out.println("Chennai All Argument Constructor");
	}
}
