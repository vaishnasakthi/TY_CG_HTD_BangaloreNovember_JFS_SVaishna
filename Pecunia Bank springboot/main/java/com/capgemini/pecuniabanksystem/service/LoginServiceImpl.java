package com.capgemini.pecuniabanksystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecuniabanksystem.dao.LoginDAO;
import com.capgemini.pecuniabanksystem.dto.Login;
import com.capgemini.pecuniabanksystem.exception.CustomException;
@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired 
	LoginDAO dao;
	
	@Override
	public Login login(Login login) throws CustomException {
		return dao.login(login);
		
	}
	

}
