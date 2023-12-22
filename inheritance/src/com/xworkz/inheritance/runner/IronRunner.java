package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Iron;

public class IronRunner {
public static void main(String[] args) {
	Iron iron = new Iron();
	iron.toString();
	
	Iron iron1 = new Iron("Solid",2000,"Magnetic core","High","CastIron","7 N/m2");
	String res=iron1.toString();
	System.out.println(res);
	
	Iron iron2 = new Iron("Solid",3000,"Magnetic core","High","CastIron","7 N/m2");
	String res1=iron2.toString();
	System.out.println(res1);
	
	Iron iron3 = new Iron("Solid",3000,"Magnetic core","High","CastIron","7 N/m2");
	boolean res2=iron3.equals(iron2);
	System.out.println(res2);
	
	Iron iron4 = new Iron("Solid",2000,"Magnetic core","High","CastIron","7 N/m2");
	boolean res3=iron4.equals(iron1);
	System.out.println(res3);
}
}
