package com.capgemini.pecuniabanksystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;

import com.capgemini.pecuniabanksystem.dto.Account;
import com.capgemini.pecuniabanksystem.exception.CustomException;

@Repository
public class AccountDAOImpl implements AccountDAO{
	
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean addAccount(Account account) throws CustomException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(account);
			transaction.commit();
			return true;
		} catch (ConstraintViolationException e) {
			throw new CustomException(" AccountNo Already Exists!!!Unable to add account");
		}
		
	}

	@Override
	public boolean deleteAccount(long accountId) throws CustomException {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			Account acc=entityManager.find(Account.class,accountId);
			entityManager.remove(acc);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			throw new CustomException("Unable to delete account!!!");
		}
		
	}

	@Override
	public boolean updateAccount(Account account) throws CustomException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Account acc=entityManager.find(Account.class,account.getAccountId());
		try {
		if(acc!=null) {
			acc.setCustomerName(account.getCustomerName());
			acc.setCustomerContactNo(account.getCustomerContactNo());
			acc.setCustomerAddress(account.getCustomerAddress());
			acc.setCountry(account.getCountry());
			acc.setState(account.getState());
			acc.setCity(account.getCity());
			acc.setZipCode(account.getZipCode());
			acc.setCustomerAadhar(account.getCustomerAadhar());
			acc.setCustomerPAN(account.getCustomerPAN());
			acc.setCustomerDOB(account.getCustomerDOB());
			acc.setCustomerGender(account.getCustomerGender());
			transaction.commit();
 			return true;
		}
		}catch(Exception e) {
			throw new CustomException("Unable to update account!!!");
		}
		
		return false;
	}

	@Override
	public Account search(long accountId) throws CustomException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Account acc= entityManager.find(Account.class, accountId);
		
		try {
			if(acc!=null) {
				return acc;
			} else {
				throw new CustomException("Unable to find account!!!");
			}
		}catch(Exception e) {
			throw new CustomException("Unable to find account!!!");
			
		}
		
		
		
	}

	@Override
	public List<Account> getAllAccount() throws CustomException {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try {
			String viewQuery="from Account";
			Query query=entityManager.createQuery(viewQuery);
			@SuppressWarnings("unchecked")
			List<Account> result= query.getResultList();
			return result;
			
		}catch(Exception e) {
			throw new CustomException("No Account details found!!! ");
			
		}
	}

}
