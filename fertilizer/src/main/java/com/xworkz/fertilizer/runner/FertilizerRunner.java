package com.xworkz.fertilizer.runner;

import Entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepository;
import com.xworkz.fertilizer.repository.FertilizerRepositoryImpl;

import java.time.LocalDate;

public class FertilizerRunner {
    public static void main(String[] args) {
        FertilizerEntity fertilizerEntity = new FertilizerEntity(2,"Urea",2,2000, LocalDate.of(2023,07,12),LocalDate.of(2025,2,21));
        FertilizerRepository repo = new FertilizerRepositoryImpl();
        repo.save(fertilizerEntity);
    }
}
