package com.xworkz.fertilizer.repository;

import Entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(EmailEntity emailEntity) {
       EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            System.out.println("Starting EntityTransaction..");
            et.begin();
            System.out.println("Starting persists..");
            em.persist(emailEntity);
            System.out.println("Persists is success..");
            et.commit();
           return emailEntity.getId();

        }
        catch (PersistenceException pe){
            System.out.println("Persistence Exception in save method:"+pe.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("Final resource is block..");
            em.close();

        }
        return null;
    }
}
