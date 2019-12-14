package com.capg.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String qrl="Update Movie set Mname=:mn where mid=:id";
			Query qry=entityManager.createQuery(qrl);
			qry.setParameter("mn", "PAA");
			qry.setParameter("id", 2019002);
			 int count=qry.executeUpdate();
			   if(count>0) {
				   System.out.println("Record Updated...");
				   
			   }else {
				   System.err.println("Something Went Wrong!!");
			   }
			   transaction.commit();
	
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}

}
