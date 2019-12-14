package com.capg.jpawithhibernate.jpql;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.jpawithhibernate.dto.Movie;

public class Retreive {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			String jpql="from Movie";
			
			
			Query qrry=(Query) entityManager.createQuery(jpql);
			List<Movie> list=((javax.persistence.Query) qrry).getResultList();
			for(Movie m1:list) {
				System.out.println("Mid : "+m1.getMid());
				System.out.println("MName : "+m1.getMname());
				System.out.println("MRating : "+m1.getMrating());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
