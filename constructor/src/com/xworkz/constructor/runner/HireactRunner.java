package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Hireact;

public class HireactRunner {
	public static void main(String args[]) {
		Hireact h1=new Hireact();
		
		Hireact h2=new Hireact("Raj Das","San Fransisco",2020,500,"35 million USD");
		System.out.println("CEO of Hireact:"+h2.ceo);
		System.out.println("Headquarters of Hireact:"+h2.headquarter);
		System.out.println("Hireact founded year:"+h2.year);
		System.out.println("Number of employees:"+h2.employees);
		System.out.println("Revenue:"+h2.revenue);
		
	}

}
