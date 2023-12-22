package com.xworkz.things;

public class AddressException extends Exception{
	public static void main(String[] args) throws Exception {
		

	
		int num = 1;
		if(num==0) {
			throw new Exception("address was not found");
		}else if(num==1) {
			throw new NullPointerException();
		}
		//System.exit(23);  // Kill the JVM Never use this comments 
	}

}
