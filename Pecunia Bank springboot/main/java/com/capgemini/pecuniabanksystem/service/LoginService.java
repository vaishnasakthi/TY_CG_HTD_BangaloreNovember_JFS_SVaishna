package com.capgemini.pecuniabanksystem.service;

import com.capgemini.pecuniabanksystem.dto.Login;
import com.capgemini.pecuniabanksystem.exception.CustomException;

public interface LoginService {
public Login login(Login login) throws CustomException; 
}
