package com.xworkz.constructor.things;

public class Land {
	public String landloardName;
	public int price;
	public String sellerName;
	public String location;
	public String brokerName;
	
	public Land() {
		System.out.println("The default value is");
	}
	public Land(String landloardName,int price,String sellerName,String location,String brokerName) {
		this.brokerName=brokerName;
		this.price=price;
		this.sellerName=sellerName;
		this.location=location;
		this.brokerName=brokerName;
	}
	public void display() {
		System.out.println("brokerName:"+this.brokerName+" "+"price:"+this.price+" "+"sellerName:"+this.sellerName+" "
				+"location:"+this.location+" "+"brokerName:"+this.brokerName);
	}
}
