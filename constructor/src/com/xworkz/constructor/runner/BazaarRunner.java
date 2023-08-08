package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Bazaar;

public class BazaarRunner {
public static void main(String args[]) {
	Bazaar street=new Bazaar("Night MALL",500,"4:30AM","5:00PM","GB ROAD");
	if(street!=null) {
		street.display();
		System.out.println("The address of reference are not equal");
	}
}
}
