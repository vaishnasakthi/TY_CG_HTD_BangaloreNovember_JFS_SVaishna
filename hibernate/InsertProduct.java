package com.capg.jpawithhibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertProduct {

	public static void main(String[] args) {
		
		Product prod=new Product();
		prod.setPid(2019001);
		prod.setPname("AMAZON");
	    
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(prod);
	    System.out.println("Record Saved...");
	    transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();


	}

}
