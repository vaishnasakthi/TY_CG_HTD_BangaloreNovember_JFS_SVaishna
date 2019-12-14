package com.capg.jpawithhibernate.onetoone;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Employee emp1=new Employee();
//		emp1.setEid(2019005);
//		emp1.setEmail("hsgdhsgh");
//		emp1.setEname("V");
//		emp1.setPassword("jahdjj");
//		
//		
//		
//		Employee_Others others1=new Employee_Others();
//		others1.setId(5);
//		others1.setPan("bh");
//		others1.setFatherName("iui");
//		others1.setMotherName("so");
//		others1.setEmployee(emp1);
		
		
		
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		Employee emp=entityManager.find(Employee.class, 2019001);
		System.out.println(emp.getOthers().getPan());  
		
//		entityManager.persist(others1);
	    System.out.println("Record Saved...");
	    transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		entityManager.close();


	}

}
