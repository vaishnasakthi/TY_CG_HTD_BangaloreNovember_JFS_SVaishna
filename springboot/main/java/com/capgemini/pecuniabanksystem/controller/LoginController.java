package com.capgemini.pecuniabanksystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecuniabanksystem.dto.Login;
import com.capgemini.pecuniabanksystem.dto.LoginResponse;
import com.capgemini.pecuniabanksystem.exception.CustomException;
import com.capgemini.pecuniabanksystem.service.LoginService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoginResponse loginUser(@RequestBody Login credentials) {
		LoginResponse response = new LoginResponse();
		try {
			Login login = service.login(credentials);
		
			if(login!=null)
			{

					response.setStatusCode(201);
					response.setMessage("Success");
					response.setDescription("Logged in");
					response.setBean(login);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Please check the credentials entered!!!");
			}
		}catch(CustomException e) {
			response.setStatusCode(401);
			response.setMessage("Failure ");
			response.setDescription(e.getMessage());
		}
		
	
		return response;
	}


}
