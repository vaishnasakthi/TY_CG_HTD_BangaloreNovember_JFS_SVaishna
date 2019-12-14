package com.capg.jpawithhibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {
		
		Movie movie=new Movie();
		movie.setMid(2019006);
		movie.setMname("ABCD2");
		movie.setMrating("Bad");
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
	    System.out.println("Record Saved...");
	    transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();

	}//end of main method

}//end of the class
