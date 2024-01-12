package com.xworkz.jan2024;

import entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunnerJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation..");

        ShopEntity shopEntity = new ShopEntity(2,"Raju Hotel","8598RJ47UK1G45Z","HSR layOut","Reddy SR");

        em.persist(shopEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("closing EM,EMF ");
        em.close();
        emf.close();
    }
}
