package com.xworkz.constructor.things;

public class Amazon {
	private String founder;
	private String type;
	private int numberOfEmploye;
	private String revenue;
	private int numberOfProduct;
	private float profit;
	private int numberOfBrands;
	private boolean service;
	private String suscribers;
	private int loss;
	
	public Amazon() {
		System.out.println("Default constructro");
	}
	public Amazon(String founder,String type,int numberOfEmploye,String revenue,int numberOfProduct,float profit,int numberOfBrands,boolean service,String suscribers,int loss) {
		System.out.println("constructor with all argument");
		this.founder=founder;
		this.type=type;
		this.numberOfEmploye=numberOfEmploye;
		this.revenue=revenue;
		this.numberOfProduct=numberOfProduct;
		this.profit=profit;
		this.numberOfBrands=numberOfBrands;
		this.service=service;
		this.suscribers=suscribers;
		this.loss=loss;
	}
	public void setFounder(String founder) {
		this.founder=founder;
	}
	public String getFounder() {
	return founder;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
	return type;
	}
	public void setNumberOfEmploye(int numberOfEmploye) {
		this.numberOfEmploye=numberOfEmploye;
	}
	public int getNumberOfEmploye() {
		return numberOfEmploye;
	}
	public void setRevenue( String revenue) {
		this.revenue=revenue;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setNumberOfProduct( int numberOfProduct) {
		this.numberOfProduct=numberOfProduct;
	}
	public int getNumberOfProduct() {
		return numberOfProduct;
	}
	public void setProfit(float profit) {
		this.profit=profit;	
	}
	public float getProfit() {
		return profit;
	}
	public void setNumberOfBrands( int numberOfBrands) {
		this.numberOfBrands=numberOfBrands;
	}
	public int getNumberOfBrands() {
		return numberOfBrands;
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
	public  void display() {
		System.out.println("Amazon founder name:"+this.founder);
		System.out.println("Type of  amazon :"+this.type);
		System.out.println("number of employe name:"+this.numberOfEmploye);
		System.out.println("Amazon revenue is:"+this.revenue);
		System.out.println("Number of product on amazon are:"+this.numberOfProduct);
		System.out.println("Amazon profit is:"+this.profit);
		System.out.println("Number of brands on amazon are:"+this.numberOfBrands);
		System.out.println("Amazon service:"+this.service);
		System.out.println("Amazon suscribers:"+this.suscribers);
		System.out.println("Amazon loss is:"+this.loss);
	}
	//public void shopping() {
	//	System.out.println("shooping method");
		
	/*}
	public void sell(){
		System.out.println("selling product method");
		
	}
	public void earn() {
		System.out.println("Earn method");
		
	}
	public void watchingMovies() {
		System.out.println("watching Movies method");
		
	}
	public void advertersing() {
		System.out.println("Advertersing method");
		
	}*/
}
