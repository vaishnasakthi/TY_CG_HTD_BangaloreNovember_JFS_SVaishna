package com.capg.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {

  EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
  EntityManager entityManager=entityManagerFactory.createEntityManager();
  Movie record=entityManager.find(Movie.class, 2019002);//Find the record usinf find()
  System.out.println("ID : "+record.getMid());// retrieve records using get()
  System.out.println("Movie Name : "+record.getMname());
  System.out.println("Movie Rating : "+record.getMrating());
  
   entityManager.close();
	}//End of main method

}//End of the class
