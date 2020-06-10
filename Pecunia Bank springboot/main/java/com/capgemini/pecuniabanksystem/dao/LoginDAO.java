package com.capgemini.pecuniabanksystem.dao;

import com.capgemini.pecuniabanksystem.dto.Login;
import com.capgemini.pecuniabanksystem.exception.CustomException;

public interface LoginDAO {
	public Login login(Login login) throws CustomException;
}
