package com.xworkz.constructor.things;

public class Soaps {
	public String brand;
	public int price;
	public float weigth;
	public String shape;
	public int profit;
	
	public Soaps() {
		System.out.println("The Default value of constructor:");
	}
	public Soaps( String brand,int price,float weigth,String shape,int profit) {
		this.brand=brand;
		this.price=price;
		this.weigth=weigth;
		this.shape=shape;
		this.profit=profit;
	}
	public void display1() {
		System.out.println("Brand:"+this.brand+" "+"Price:"+this.price+" "+"Weigth:"+this.weigth+" "+"Shape:"+this.shape+" "+"Profit:"+this.profit);
	}
}

