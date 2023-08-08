package com.xworkz.constructor.things;

public class Telegram {
	private String type;
	private int numberOfGroup;
	private String viwers;
	private String founder;
	private int numberOfChannels;
	private String  estd;
	private int profit;
	private boolean service;
	private String rating;
	private int loss;
	
	public Telegram() {
		System.out.println("The default constructor");
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
	return type;
	}
	public void setNumberOfGroup(int numberOfGroup) {
		this.numberOfGroup=numberOfGroup;
	}
	public int getNumberOfGroup() {
	return numberOfGroup;
	}
	public void setViwers(String viwers) {
		this.viwers=viwers;
	}
	public String getViwers() {
		return viwers;
	}
	public void setFounder( String founder) {
		this.founder=founder;
	}
	public String getFounder() {
		return founder;
	}
	public void setNumberOfChannels( int numberOfChannels) {
		this.numberOfChannels=numberOfChannels;
	}
	public int getNumberOfChannels() {
		return numberOfChannels;
	}
	
	public void setEstd( String estd) {
		this.estd=estd;
	}
	public String getEstd() {
		return estd;
	}
	public void setProfit(int profit) {
		this.profit=profit;
	}
	public int getProfit() {
		return profit;
	}
	public void setService( boolean service) {
		this.service=service;
	}
	public boolean getService() {
		return service;
	}
	public void setRating(String rating) {
		this.rating=rating;
	}
	public String getRating() {
		return rating;
	}
	public void setLoss(int loss) {
		this.loss=loss;
	}
	public int getLoss() {
		return loss;
	}
	public void display() {
		System.out.println("Type of Telegram:"+this.type);
		System.out.println("Number of group on Telegram are:"+this.numberOfGroup);
		System.out.println("Number of viwers on telegram are:"+this.viwers);
		System.out.println("Telegram founder name is:"+this.founder);
		System.out.println("Number of channels are:"+this.numberOfChannels);
		System.out.println("Telegram established on:"+this.estd);
		System.out.println("Net profit is:"+this.estd);
		System.out.println("Telegram service is:"+this.service);
		System.out.println("Rating of Telegram is:"+this.rating);
		System.out.println("Net loss is:"+this.loss);
	}
	/*public void audiocall() {
		System.out.println("The audiocall constructor");
	}
	public void videocall() {
		System.out.println("The default constructor");
	}
	public void chatting() {
		System.out.println("The default constructor");
	}
	public void groupcall() {
		System.out.println("The default constructor");
	}
	public void downloading() {
		System.out.println("The default constructor");
	} */
	
}
