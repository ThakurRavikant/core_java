package com.xworkz.inheritance.things;

public class Ott {
	public double rating;
	public String numOfSubscriber;

	public Ott() {
		System.out.println("No Argument Constructor of Ott Class");
	}
	public Ott(double rating,String numOfSubscriber) {

		this.rating=rating;
		this.numOfSubscriber=numOfSubscriber;
	}
	@Override
	public String toString() {
		return rating+" "+numOfSubscriber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ott o = (Ott) obj;
		if(this.rating==o.rating && this.numOfSubscriber==o.numOfSubscriber)
			return true;
		return false;

	}
}