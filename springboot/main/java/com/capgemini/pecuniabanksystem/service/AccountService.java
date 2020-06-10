package com.capgemini.pecuniabanksystem.service;

import java.util.List;

import com.capgemini.pecuniabanksystem.dto.Account;
import com.capgemini.pecuniabanksystem.exception.CustomException;

public interface AccountService {
	public boolean addAccount(Account account) throws CustomException;
	public boolean deleteAccount(long accountId) throws CustomException;
	public boolean updateAccount(Account account) throws CustomException;
	public Account search(long accountId) throws CustomException;
	public List<Account> getAllAccount() throws CustomException;
}
