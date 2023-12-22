package com.xworkz.functionalMethod.interfaces;

import com.xworkz.functionalMethod.tester.Iphone;
import com.xworkz.functionalMethod.tester.NewsPaper;

public class FunctionalTester {
	
	public static void main(String[] args) {
		System.out.println("Calling Newspaper in fuctional Tester..");
		
		NewsPaper newspaper=(agency)->{		
			
			if(agency.equals("ITO")) {
				return 8;			
			}
			else if(agency.equals("DC")) {
				return 5;			
			}else if(agency.equals("HI")) {
				return 3;			
			}
			return 0;		
		};
		
		 call(newspaper, "ITO");

	}
	Iphone iphone=()->{
		System.out.println("Calling Iphone in fuctional Tester..");
		
		if(iphone.equals(" ")) {
			System.out.println();
		}
		return true;
		
	};

	static void call(NewsPaper paper, String agency) {
		
		double val=paper.priceByAgency(agency);
		System.out.println("Value is:"+val);
		 
	 }

}
