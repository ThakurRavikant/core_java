package com.xworkz.inheritance.things;

public class Kerala extends India{
	public String nameOFFamousFood;
	public String religious;
	
	public Kerala() {
		System.out.println("Kerala No Argument Constructor");
	}
	public Kerala(String nameOFFamousFood, String religious) {
		System.out.println("Kerala All Argument Constructor");
	}
}
