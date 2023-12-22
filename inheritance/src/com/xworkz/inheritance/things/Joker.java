package com.xworkz.inheritance.things;

public class Joker {
	public String name;
	public String directorName;
	public String writerName;
	public int budget;
	public String releasedDate;
	public double rating;
	public String customerFeedback;
	public boolean graphic;

	public Joker() {
		System.out.println("No argument Constructor of Joker class");
	}

	public Joker(String name, String directorName, String writerName, int budget, String releasedDate, double rating,
			String customerFeedback, boolean graphic) {
		this.name = name;
		this.directorName = directorName;
		this.writerName = writerName;
		this.budget = budget;
		this.releasedDate = releasedDate;
		this.rating = rating;
		this.customerFeedback = customerFeedback;
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return name+" "+directorName+" "+writerName+" "+budget+" "+releasedDate+" "+rating+" "+customerFeedback+" "+graphic;
	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return false;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joker jok = (Joker) obj;
		if (this.name == jok.name && this.directorName == jok.directorName && this.writerName == jok.writerName
				&& this.budget == jok.budget && this.releasedDate == jok.releasedDate && this.rating == jok.rating
				&& this.customerFeedback==jok.customerFeedback && this.graphic==jok.graphic) 

			return true;

		return false;
	}

}

