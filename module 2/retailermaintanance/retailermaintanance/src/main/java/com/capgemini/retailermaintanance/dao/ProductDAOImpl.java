package com.capgemini.retailermaintanance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintanance.dto.OrderInfo;
import com.capgemini.retailermaintanance.dto.ProductInfo;
import com.capgemini.retailermaintanance.dto.UserInfo;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean createProfile(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserInfo login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user=manager.find(UserInfo.class, email);
		return user;
	}

	@Override
	public ProductInfo getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product=manager.find(ProductInfo.class, id);
		return product;
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInfo bean=manager.find(UserInfo.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public double totalAmt(ProductInfo product) {
		
		
		
		return 1000;
		
		
	}

	@Override
	public List<OrderInfo> getOrder() {
		EntityManager manager = factory.createEntityManager();
		String getall="from OrderInfo";
		TypedQuery<OrderInfo> query=manager.createQuery(getall,OrderInfo.class);
		return query.getResultList();
	}

}
