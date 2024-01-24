package com.xworkz.fertilizer.repository;

import Entity.FertilizerEntity;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository{

   private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity entity) {
        EntityManager em = emf.createEntityManager();
         EntityTransaction et = em.getTransaction();
        try{
            System.out.println("Starting ET...");
            et.begin();
            System.out.println("Starting persists...");
            em.persist(entity);
            System.out.println("Persists is success..");
            et.commit();
            return entity.getId();

        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of Fertilizer:"+pe.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("Finally resource is block");
            em.close();
        }
        return null;
    }
}
