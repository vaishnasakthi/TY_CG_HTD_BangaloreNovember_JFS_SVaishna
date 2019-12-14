package com.capg.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.jpawithhibernate.dto.Movie;

public class Specific {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			String jpql="Select mname from Movie";
		
			Query qrry=entityManager.createQuery(jpql);
			List<String> list=qrry.getResultList();
			for(String m1:list) {
				
			System.out.println("Mname : "+m1);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
