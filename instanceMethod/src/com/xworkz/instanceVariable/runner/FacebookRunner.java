package com.xworkz.instanceVariable.runner;

import com.xworkz.instanceVariable.thing.Facebook;

public class FacebookRunner {
public static void main(String[] args) {
	Facebook facebook=new Facebook();
	facebook.register("Ravi", "Thakur", "Male", "06 sep 2000" );
	facebook.logIn("Ravikant", "6201279485");
	System.out.println(facebook.logIn("Raviakant", "6201279485"));
}
}
