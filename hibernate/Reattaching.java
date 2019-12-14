package com.capg.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class Reattaching {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;

		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Product record=entityManager.find(Product.class, 2019001);
			System.out.println(entityManager.contains(record));
			entityManager.detach(record);
			System.out.println(entityManager.contains(record));
			Product reattachProduct=entityManager.merge(record);//used to reattach the object
			reattachProduct.setPname("SAMSUNG");
            record.setPname("PHILIPS");
         
			System.out.println("Record Update...");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}

}
