package com.xworkz.fertilizer.repository;

import Entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositoryImpl implements TravelRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TravelEntity entity) {
      EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
        try{
            System.out.println("Starting ET...");
            et.begin();
            System.out.println("Starting persists..");
            em.persist(entity);
            System.out.println("Persists is success..");
            et.commit();
        return entity.getId();

        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method:"+pe.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("Final resource is block..");
            em.close();

        }
        return null;
    }
}
