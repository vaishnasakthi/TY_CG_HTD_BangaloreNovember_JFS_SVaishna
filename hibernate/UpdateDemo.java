package com.capg.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;

		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 2019002);
            record.setMname("ABCD2");
            record.setMrating("Very Good");
			System.out.println("Record Update...");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();

	}//end of main method
}//end of updateDemo
