package com.xworkz.runner;

import com.xworkz.things.Loging;

public class LogingRunner {
	public static void main(String[] args) throws Exception {
		Loging log = new Loging("Ravi", "xworkz123@gmail.com");
	if(log.getName().equals("ravi")) {
	System.out.println(log.getName());
		throw new Exception("Name was not Found");
		
	}
	
	if(log.getEmail().equals("xworkz123@gmail.com")) {
		System.out.println(log.getEmail());
		throw new Exception("Email was not Found");
		}
		
	}
	}


