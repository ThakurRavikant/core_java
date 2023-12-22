package com.xworkz.inheritance.things;

public class GaneshChaturthi extends Festival {
	protected String drumBeats;
	protected String devotionalSinging;
	protected String dancing;
	protected boolean aims;
	
	
	public GaneshChaturthi() {
		System.out.println("Default Constructor of GaneshChaturthi");
	}
	public GaneshChaturthi(String drumBeats,String devotionalSinging,String dancing,boolean aims) {
		
		System.out.println("Default Constructor of GaneshChaturthi");
		this.drumBeats=drumBeats;
		this.devotionalSinging=devotionalSinging;
		this.dancing=dancing;
		this.aims=aims;
		
	}
	public void display() {
		System.out.println("This is display method of GaneshChaturthi class");
	}
}
