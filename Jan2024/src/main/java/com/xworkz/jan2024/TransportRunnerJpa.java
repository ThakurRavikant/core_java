package com.xworkz.jan2024;

import entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TransportRunnerJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation..");

        TransportEntity transportEntity = new TransportEntity(2,"Truck","12DH1010","Delhi_To_UP","Glasses");

        em.persist(transportEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("closing EM,EMF ");
        em.close();
        emf.close();

    }
}
