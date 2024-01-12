package com.xworkz.jan2024;

import entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunnerJpa {
    public static void main(String[] args) {
       EntityManagerFactory emf  =Persistence.createEntityManagerFactory("x-workz");
       EntityManager  em =emf.createEntityManager();
        System.out.println("EM:"+em);
       EntityTransaction et =em.getTransaction();
       System.out.println("ET :"+et);
       et.begin();
        System.out.println("ET Begin");
        System.out.println("starting operation");

        TrafficEntity trafficEntity = new TrafficEntity(2,"BTM Layout",50,"Red","25km/hr");
        em.persist(trafficEntity);
        System.out.println("Operation Completed");

        et.commit();
        System.out.println("ET commit");
        System.out.println("closing EM,EMF ");
        em.close();
        emf.close();
    }


}
