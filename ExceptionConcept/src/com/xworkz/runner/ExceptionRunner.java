package com.xworkz.runner;

import com.xworkz.things.NameException;
import com.xworkz.things.NameExceptions;

public class ExceptionRunner {
	public static void main(String[] args) {
		try {
			int[] num= {1,2,3,4,5};
			System.out.println("This is  array out of Boundary Exception");
			try {
				throw new NameExceptions();
			}catch(NameExceptions name) {
				System.out.println("Name Custom Exception occured");
			}
		}catch(ArrayIndexOutOfBoundsException array) {
			System.out.println(array.getCause());
			System.out.println(array.getMessage());
			array.printStackTrace();
		}finally {
			System.out.println("Finally block in try- catch block");
		}
	}

}
