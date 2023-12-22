package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Google;
import com.xworkz.inheritance.things.GoogleMeeting;
import com.xworkz.inheritance.things.GooglePay;
import com.xworkz.inheritance.things.GoogleSearchEngine;


public class GoogleRunner extends GoogleMeeting {
	public static void main(String[] args) {
		GoogleRunner googlerunner = new GoogleRunner();
		googlerunner.search2();
		googlerunner.search1();
		googlerunner.creat1();
		
		
	}

}
