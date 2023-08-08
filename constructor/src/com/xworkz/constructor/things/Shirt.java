package com.xworkz.constructor.things;

public class Shirt {
	public String color;
	public String brand;
	public int marketPrice;
	public String design;
	public int numberOfBottom;
	public int sellingPrice;
	public char logo;
	public String way;
	public String look;
	public int width;
	
	public Shirt() {
		System.out.println("this is default value of constructor");
	}
	
	 public Shirt(String color, String brand, int marketPrice, String design, int numberOfBottom, 
			 int sellingPrice, char logo, String way, String look, int width){
		 this.color=color;
		 this.brand=brand;
		 this.marketPrice=marketPrice;
		 this.design=design;
		 this.numberOfBottom=numberOfBottom;
		 this.sellingPrice=sellingPrice;
		 this.logo=logo;
		 this.look=look;
		 this.width=width;
		  }
	 public void display() {
		 System.out.println("color:"+this.color+" "+"brand:"+this.brand+" "+"marketPrice:"
	 +this.marketPrice+" "+"design:"+this.design+" "+"numberOfBottom:"+this.numberOfBottom+" "+"sellingPrice:"
				 +this.sellingPrice+" "+"logo:"+this.logo+" "+"look:"+this.look+" "+"width:"+this.width);
	 }

}
