package com.capgemini.pecuniabanksystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.pecuniabanksystem.dto.Login;
import com.capgemini.pecuniabanksystem.exception.CustomException;
@Repository
public class LoginDAOImpl implements LoginDAO{
	
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	
	Login bean;
	
	@Override
	public Login login(Login login) throws CustomException {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String login1 = "from Login where userName=:id and password=:pass";
		TypedQuery<Login> query = manager.createQuery(login1, Login.class);
		query.setParameter("id", login.getUserName());
		query.setParameter("pass", login.getPassword());
        try {
        	bean= query.getSingleResult();
        	if (bean.getPassword().equalsIgnoreCase(login.getPassword()) &&(bean.getUserName().equalsIgnoreCase(login.getUserName()))  ) {
				
				return bean;
			
		} else {
			return null;
		}
        }catch(Exception e) {
        	throw new CustomException("Please check the credentails entered!!");
        	
        }
	
	}

}
