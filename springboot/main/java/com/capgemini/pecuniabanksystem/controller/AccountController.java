package com.capgemini.pecuniabanksystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecuniabanksystem.dto.Account;
import com.capgemini.pecuniabanksystem.dto.AccountResponse;
import com.capgemini.pecuniabanksystem.exception.CustomException;
import com.capgemini.pecuniabanksystem.service.AccountService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@PostMapping(path = "/addAccount", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse addAccount(@RequestBody Account account) {
		AccountResponse response= new AccountResponse();
		try {
			if(accountService.addAccount(account)) {
				response.setStatusCode(200);
				response.setMessage("Success !!");
				response.setDescription("Account Created Successfully!!!");
			}
			else {
				response.setStatusCode(401);
				response.setMessage("Failure");
			}

		}catch(Exception e) {
			response.setStatusCode(401);
			response.setMessage("Account Number alread exists!!!");
			response.setDescription(e.getMessage());

		}
		return response;
	}
	@DeleteMapping(path = "/deleteAccount/{accountId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse deleteAccount(@PathVariable("accountId")long id) {
		AccountResponse response= new AccountResponse();
		try {
			if(accountService.deleteAccount(id)) {
				response.setStatusCode(200);
				response.setMessage("Success");
				response.setDescription("Customer  Account deleted Successfully!!!");	
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
			}
		}catch(Exception e) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(e.getMessage());	
		}
		return response;	
	}
	@PostMapping(path = "/singleAccount/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse searchAccount(@PathVariable("accountId")long id) {
		AccountResponse response= new AccountResponse();
		Account acc;
		try {
			acc=accountService.search(id);
			if(acc!=null) {
				response.setStatusCode(200);
				response.setMessage("Success");
				response.setDescription("Account details found successfully!!!");	
				response.setBean(Arrays.asList(acc));
			} 

		}catch(Exception e) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(e.getMessage());
		}
		return response;

	}
	@PutMapping(path = "/modifyAccount",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse updateAccount(@RequestBody Account account) {
		AccountResponse response= new AccountResponse();
		try {
			if(accountService.updateAccount(account)) {
				response.setStatusCode(200);
				response.setMessage("Success !!");
				response.setDescription("Account details updated Successfully");	

			}else {
				response.setStatusCode(401);
				response.setMessage("Failure !!");
				response.setDescription("AccountNo does'nt exists!!!unable to update the account");
			}

		}catch(Exception e) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(e.getMessage());

		}
		return response;

	}
	@GetMapping(path = "/getAllAccount", produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse getAllAccount() {
		AccountResponse response= new AccountResponse();
		List<Account> result;
		try {
			result=accountService.getAllAccount();
			if(!result.isEmpty()) {
				response.setStatusCode(200);
				response.setMessage("Success ");
				response.setDescription("Account details are");
				response.setBean(result);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure !!");
				response.setDescription("No Acount details not found!!!");
			}
		}catch(CustomException e) {
			
				response.setStatusCode(401);
				response.setMessage("Failure !!");
				response.setDescription(e.getMessage());

		}
		return response;

	}

}
