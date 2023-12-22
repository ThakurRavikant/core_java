package com.xworkz.runner;

import com.xworkz.dto.ApartmentRepositoryImp;

public class ApartmentRunner {
	public static void main(String[] args) {
		ApartmentRepositoryImp ap = new ApartmentRepositoryImp();
		ap.save("Galaxy Apart");
		ap.save("Manat Apart");
		ap.save("Vishal Apart");
		ap.save("Hari Apart");
		ap.save("Galaxy2.0 Apart");

		ap.display();
	}

}
