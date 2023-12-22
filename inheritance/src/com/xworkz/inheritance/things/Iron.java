package com.xworkz.inheritance.things;

public class Iron {
	public String states;
	public int cost;
	public String coresName;
	public String grade;
	public String type;
	public String stress;
	
	public Iron() {
		System.out.println("No argument Constructor of Iron class");
	}
	
	 public Iron(String states, int cost, String coresName, String grade, String type, String stress) {
		super();
		this.states = states;
		this.cost = cost;
		this.coresName = coresName;
		this.grade = grade;
		this.type = type;
		this.stress = stress;
	}

	@Override
	public String toString() {
		return states+" "+cost+" "+coresName+" "+grade+" "+type+" "+stress;
	}
	 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Iron ir = (Iron) obj;
		if (this.states == ir.states && this.cost== ir.cost && this.coresName==ir.coresName 
				&& this.grade==ir.grade && this.type==ir.type && this.stress==ir.stress) 
			
		return true;
		
		return false;
		}
	
		
}
