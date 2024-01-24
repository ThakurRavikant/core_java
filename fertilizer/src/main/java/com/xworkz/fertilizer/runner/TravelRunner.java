package com.xworkz.fertilizer.runner;

import Entity.TravelEntity;
import com.xworkz.fertilizer.repository.TravelRepository;
import com.xworkz.fertilizer.repository.TravelRepositoryImpl;

import java.time.LocalDate;

public class TravelRunner {
    public static void main(String[] args) {
        TravelEntity travelEntity  = new TravelEntity(1,"Bangalore","Goa",10000,"562km","Visit","10hr22min","Train", LocalDate.of(2024,02,10),LocalDate.of(2024,02,20));
        TravelRepository repo = new TravelRepositoryImpl();
        repo.save(travelEntity);
    }
}
