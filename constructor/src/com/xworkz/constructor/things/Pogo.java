package com.xworkz.constructor.things;

public class Pogo {
	private String type;
	private String shows;
	private String lunchDate;
	private String founder;
	private int numberOfShows;
	private int  viwers;
	private int charge;
	private boolean service;
	private String suscribers;
	private int loss;
	
	public Pogo() {
		System.out.println("Default constructor");
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
	return type;
	}
	public void setShows(String shows) {
		this.shows=shows;
	}
	public String getShows() {
	return shows;
	}
	public void setLunchDate(String lunchDate) {
		this.lunchDate=lunchDate;
	}
	public String getLunchDate() {
		return lunchDate;
	}
	public void setFounder( String founder) {
		this.founder=founder;
	}
	public String getFounder() {
		return founder;
	}
	public void setNumberOfShows( int numberOfShows) {
		this.numberOfShows=numberOfShows;
	}
	public int getNumberOfShows() {
		return numberOfShows;
	}
	public void setViwer(int  viwers) {
		this.viwers=viwers;	
	}
	public int getViwer() {
		return viwers;
	}
	public void setCharge( int charge) {
		this.charge=charge;
	}
	public int getCharge() {
		return charge;
	}
	public void setService( boolean service) {
		this.service=service;
	}
	public boolean getService() {
		return service;
	}
	public void setSuscribers(String suscribers) {
		this.suscribers=suscribers;
	}
	public String getSuscribers() {
		return suscribers;
	}
	public void setLoss(int loss) {
		this.loss=loss;
	}
	public int getLoss() {
		return loss;
	}
	public void display() {
		System.out.println("Pogo is type of:"+this.type);
		System.out.println("Number of shows :"+this.numberOfShows);
		System.out.println("Pogo lunch date is:"+this.lunchDate);
		System.out.println("Pogo founder name is:"+this.founder);
		System.out.println("Number if shows in pogo are:"+this.numberOfShows);
		System.out.println("Number of viwers are:"+this.viwers);
		System.out.println("Charge of Pogo is:"+this.charge);
		System.out.println("Pogo service is:"+this.service);
		System.out.println("number of suscriber are:"+this.suscribers);
		System.out.println("Net Loss of Pogo is:"+this.loss);
		
	}
	/*public void entertainment() {
		System.out.println("entertainment");
	}
	public void message() {
		System.out.println("Message");
	}
	public void teach() {
		System.out.println("Teach");
	}
	public void happy() {
		System.out.println("Happy");
	}
	public void sharingLove() {
		System.out.println("Sharing love");
	} */
}
