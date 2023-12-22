package com.xworkz.inheritance.things;

public class Steel {
	public String grade;
	public int price;
	public boolean hardness;
	public String states;
	
	public Steel() {
	System.out.println("No agrument Constructor of Steel CLass");
	}
	
	public Steel(String grade, int price, boolean hardness, String states) {
		this.grade = grade;
		this.price = price;
		this.hardness = hardness;
		this.states = states;
	}
	
	 @Override
	public String toString() {
		return grade+" "+price+" "+hardness+" "+states;
	}

	@Override
	public boolean equals(Object obj1) {
		if (this == obj1)
			return true;
		if (obj1 == null)
			return false;
		if (getClass() != obj1.getClass())
			return false;
		Steel s = (Steel) obj1;
		if (this.grade == s.grade && this.price == s.price && this.hardness==s.hardness && this.states==s.states) {
			return true;
			
		}
		return false;
			
	}

	
}
