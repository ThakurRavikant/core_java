package com.xworkz.inheritance.things;

public class BuiltMethods extends Object {
 
	public int hasCode() {
		return 1500;
		
	}
	public boolean equals(Object obj) {
		return(obj=="Hulk");
	}
	public String toString() {
		return "Welcome to World";
	}
	public Object clone() {
		
		return "This is clone method";
	}
	public void finalize() {
		System.out.println("This is a finalize method in Built method Class");
	}
	
	public static void main(String[] args) {
		BuiltMethods bm = new BuiltMethods();
		//bm.hashCode();
		int store=bm.hashCode();
		System.out.println(store);
		bm.equals(bm);
		boolean val=bm.equals(bm);
		System.out.println(val);
		bm.toString();
		String str=bm.toString();
		System.out.println(str);
		bm.clone();
		Object cl=bm.clone();
		System.out.println(cl);
		bm.finalize();
		
	}
}
