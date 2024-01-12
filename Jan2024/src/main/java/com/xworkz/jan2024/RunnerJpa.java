package com.xworkz.jan2024;

import entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RunnerJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et =em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation..");

        SuperHeroEntity superHeroEntity = new SuperHeroEntity(1,"Tony Stark","Iron Man","Robotics","Wife","USA");

        em.persist(superHeroEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("closing EM,EMF ");
        em.close();
        emf.close();


    }
}
