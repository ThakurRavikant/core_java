package com.xworkz.inheritance.things;

public class Festival {
	protected String name;
	protected float startDate;
	protected float endDate;
	protected String startDay;
	protected String endDay;
	protected String months;
	protected String foods;
	protected String godsName;
	protected String celebration;
	protected String decorations;
	protected String music;
	protected String dance;
	protected String festivalCloths;
	protected String nameOfCloths;
	protected String specialGuests;
	protected String description;
	protected String activities;
	protected String organizers;
	protected String sponsors;
	protected boolean hasParades;
	
	public Festival() {
		System.out.println("Default constructor of festival");
	}
	
	public Festival(String name,float startDate,float endtDate,String startDay,String endDay, String months,String foods, String godsName,String celebration,
			String decorations,	String music,String dance, String festivalCloths,String specialGuests,String description,String activities,String organizers,
			String sponsors,boolean hasParades	) {
		System.out.println("All argument constructor of festival");
		this.name=name;
		this.startDate=startDate;
		this.endDate=endDate;
		this.startDay=startDay;
		this.endDay=endDay;
		this.months=months;
		this.foods=foods;
		this.godsName=godsName;
		this.celebration=celebration;
		this.decorations=decorations;
		this.music=music;
		this.dance=dance;
		this.festivalCloths=festivalCloths;
		this.nameOfCloths=nameOfCloths;
		this.specialGuests=specialGuests;
		this.description=description;
		this.activities=activities;
		this.organizers=organizers;
		this.sponsors=sponsors;
		this.hasParades=hasParades;
		
		
		
		
	}
	
	public Festival(String name,String startDay,String endDay,boolean hasParades) {
		System.out.println(name+" "+startDate);
		
	}
	public void display() {
		System.out.println("This is display method of Festival class");
	}
	
	
	

}
