package com.capg.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.onetoone.Employee;

public class ManyToMany {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setEid(2019002);
		emp1.setEmail("sjdsh");
		emp1.setEname("Ram");
		emp1.setPassword("hsgdh");
		
		Employee emp2=new Employee();
		emp2.setEid(2019003);
		emp2.setEmail("dgfs");
		emp2.setEname("Raj");
		emp2.setPassword("xvhsgdh");
		
		ArrayList<Employee> aList=new ArrayList<Employee>();
		aList.add(emp1);
		aList.add(emp2);
		
		Training t1=new Training();
		t1.setTid(001);
		t1.setTname("jka");
		t1.setEList(aList);
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(t1);
	    System.out.println("Record Saved...");
	    transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		entityManager.close();

	}

}
