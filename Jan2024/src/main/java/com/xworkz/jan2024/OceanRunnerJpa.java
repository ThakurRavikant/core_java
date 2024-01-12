package com.xworkz.jan2024;

import entity.FilmEntity;
import entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanRunnerJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation..");

        OceanEntity oceanEntity = new OceanEntity(2,"Pacific","10911m","Not","Blue");

        em.persist(oceanEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("closing EM,EMF ");
        em.close();
        emf.close();
    }
}
