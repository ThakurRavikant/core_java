package com.xworkz.util;

public class LabourUtil {
public static boolean validateString(String strings) {
	if(strings!=null && !strings.isEmpty() && strings.length() > 3 && strings.length()>40) {
		return true;
	}else {
		System.err.println(strings);
	}
	return true;
}
	public static boolean validatenumbers(double dou) {
		if(dou < 100 && dou > 20) {
			return false;
			
		}else {
			System.out.println(dou);
		}
		return true;	
	}
	
	
}

