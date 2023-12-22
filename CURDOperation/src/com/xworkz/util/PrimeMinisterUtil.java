package com.xworkz.util;

public class PrimeMinisterUtil {
	
	public static boolean validate(String string) {
		if(string != null && !string.isEmpty() && string.length()>3 && string.length()<30) {
			return true;
		}else {
			System.err.println(string);
		}	
		return true;
			
	}
	public static boolean validatenumbers(int idNum) {
		if(idNum!= 0 && idNum > 10) {
			return false;
			
		}else {
			System.out.println(idNum);
		}
		return true;	
	}
}
