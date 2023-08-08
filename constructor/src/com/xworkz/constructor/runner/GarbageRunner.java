package com.xworkz.constructor.runner;

public class GarbageRunner {
public static void main(String args[]) {
	Garbage abAbdul=new Garbage("XYZ","INDORE",25000,1000,true);
	
	if(abAbdul!=null) {
		abAbdul.display();
		System.out.println("The value of reference is not equal");
	}
}
}
