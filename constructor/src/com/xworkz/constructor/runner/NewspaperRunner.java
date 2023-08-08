package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Newspaper;

public class NewspaperRunner {
public static void main(String args[]) {
	Newspaper ram=new Newspaper("ACCIDENTS","NEW YORK TIMES",100,2000,true);
	if(ram!=null) {
		ram.display();
		System.out.println("the value is not equal");
	}
}
}
