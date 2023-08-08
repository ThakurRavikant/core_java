package com.xworkz.constructor.things;

public class Football {
	public String playersName[];
	public int salary[];
	public int ages[];
	public String clubName;
	public String groundName;
	public String headCoach;
	
	public Football() {
		System.out.println("A constructor with no argument");
	}
	
	public Football( String playersName[]) {
		System.out.println("1 array argument constructor");
		this.playersName=playersName;
		for(int i=0; i<playersName.length; i++) {
			System.out.println("Players Name are:"+playersName[i]);
		}
	}
	public Football( String playersName[],int salary[]) {
		System.out.println("2 Array argument constructor");
		this.playersName=playersName;
		for(int i=0; i<playersName.length; i++) {
			System.out.println("Players Name are:"+playersName[i]);
		}
			this.salary=salary;
			for(int i=0; i<salary.length; i++) {
				System.out.println("Players salary are:"+salary[i]);
		}
	}
	public Football( String playersName[],int salary[], int ages[]) {
		System.out.println("3 Array argument constructor");
		this.playersName=playersName;
		for(int i=0; i<playersName.length; i++) {
			System.out.println("Players Name are:"+playersName[i]);
		}
			this.salary=salary;
			for(int i=0; i<salary.length; i++) {
				System.out.println("Players Salary are:"+salary[i]);
		}
			this.ages=ages;
			for(int i=0; i<ages.length; i++) {
				System.out.println("Players Ages are:"+ages[i]);	
			}
	}
	public Football(String clubName) {
		System.out.println("1 Argument Constructor");
		this.clubName=clubName;
	}
	public Football(String clubName, String groundName) {
		System.out.println("2 Argument Constructor");
		this.groundName=groundName;
	}
	public Football(String clubName, String groundName,String headCoach) {
		System.out.println("3 Argument Constructor");
		this.headCoach=headCoach;
	}
	public Football(String clubName,String playersName[]) {
		this.clubName=clubName;
		for(int i=0; i<playersName.length; i++) {
			System.out.println("Players Name are:"+playersName[i]);
		}
		this.playersName=playersName;
	}
	public Football(String clubName, String groundName,String headCoach,int salary[]) {
	System.out.println(" Constructor with 3 argument and 1 array");
	this.clubName=clubName;
	this.groundName=clubName;
	this.headCoach=headCoach;
	this.salary=salary;
		for(int i=0; i<salary.length; i++) {
		System.out.println("Players Salary are:"+salary[i]);
		}
	}
	public Football( String clubName, String groundName,String headCoach,String playersName[],int salary[], int ages[]) {
		System.out.println("Constructor with all argument ");
		this.clubName=clubName;
		this.groundName=clubName;
		this.headCoach=headCoach;
		this.salary=salary;
		
		this.playersName=playersName;
		for(int i=0; i<playersName.length; i++) {
			System.out.println("Players Name are:"+playersName[i]);
		}
			this.salary=salary;
			for(int i=0; i<salary.length; i++) {
				System.out.println("Players Salary are:"+salary[i]);
		}
			this.ages=ages;
			for(int i=0; i<ages.length; i++) {
				System.out.println("Players Ages are:"+ages[i]);	
			}
	}
	public void displayFootball() {
		System.out.println("Players Name are:"+this.playersName);
		System.out.println("Players ages are:"+this.ages);
		System.out.println("Players salary are:"+this.salary);
		System.out.println("Players club Name are:"+this.clubName);
		System.out.println("GroundName  are:"+this.groundName);
		System.out.println("HeadCoach name are:"+this.headCoach);
	}
}
