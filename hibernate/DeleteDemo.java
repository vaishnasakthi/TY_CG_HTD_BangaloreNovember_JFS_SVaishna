package com.capg.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try{
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 2019001);//to find a record using find()
			entityManager.remove(record);// remove() to delete the record
			System.out.println("Removed Record...");
			transaction.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}

}
