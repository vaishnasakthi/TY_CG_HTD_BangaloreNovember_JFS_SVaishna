package com.capgemini.pecuniabanksystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecuniabanksystem.dao.AccountDAO;
import com.capgemini.pecuniabanksystem.dto.Account;
import com.capgemini.pecuniabanksystem.exception.CustomException;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDAO dao;
	
	@Override
	public boolean addAccount(Account account) throws CustomException {
		return dao.addAccount(account);
	}

	@Override
	public boolean deleteAccount(long accountId) throws CustomException {
		return dao.deleteAccount(accountId);
	}

	@Override
	public boolean updateAccount(Account account) throws CustomException {
		return dao.updateAccount(account);
	}

	@Override
	public Account search(long accountId) throws CustomException {
		return dao.search(accountId);
	}

	@Override
	public List<Account> getAllAccount() throws CustomException {
		
		return dao.getAllAccount();
	}

}
