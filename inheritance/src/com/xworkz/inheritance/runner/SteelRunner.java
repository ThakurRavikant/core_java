package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Steel;

public class SteelRunner {
public static void main(String[] args) {
	Steel steel = new Steel();
	String val=steel.toString();
	
	Steel steel1 = new Steel("HK",5000,true,"Solid");
	String val1=steel1.toString();
	System.out.println(val1);
	
	Steel steel2 = new Steel("HT",5000,false,"Solid");
	String val2=steel1.toString();
	System.out.println(val2);
	
	Steel steel3 = new Steel("HK",5000,false,"Solid");
	boolean val3=steel3.equals(steel1);
	System.out.println(val3);
	
	Steel steel4 = new Steel("HT",5000,false,"Solid");
	boolean val4=steel4.equals(steel2);
	System.out.println(val3);
}
}
