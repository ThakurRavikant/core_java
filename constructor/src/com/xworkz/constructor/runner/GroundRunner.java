package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Ground;

public class GroundRunner {
	public static void main(String args[]) {
		Ground layout=new Ground("Btm Layout","Rajajinagar",15000,5,true);
		if(layout!=null) {
			layout.display();
			System.out.println("The valu equal are:");
		}
	}

}
