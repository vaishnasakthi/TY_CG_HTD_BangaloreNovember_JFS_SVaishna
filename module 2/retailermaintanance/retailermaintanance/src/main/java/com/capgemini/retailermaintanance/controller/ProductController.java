package com.capgemini.retailermaintanance.controller;

import org.springframework.http.MediaType;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintanance.dto.OrderInfo;
import com.capgemini.retailermaintanance.dto.OrderResponse;
import com.capgemini.retailermaintanance.dto.ProductInfo;
import com.capgemini.retailermaintanance.dto.ProductResponse;
import com.capgemini.retailermaintanance.dto.TotalResponse;
import com.capgemini.retailermaintanance.dto.UserInfo;
import com.capgemini.retailermaintanance.dto.UserResponse;
import com.capgemini.retailermaintanance.factory.ProductFactory;
import com.capgemini.retailermaintanance.service.ProductService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*", allowCredentials="true" )
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping(path="/create-profile",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody UserInfo user) {
		ProductResponse response = new ProductResponse();
		if(service.createProfile(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/login",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestParam("email") String email, @RequestParam("password") String password) {
		UserResponse response=new UserResponse();
		UserInfo user=service.login(email,password);

			if(user.getEmail().equalsIgnoreCase(email)&&user.getPassword().equalsIgnoreCase(password)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login Successful...");
			response.setProduct(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Incorrect credentials!!!");
		}
		return response;
	}
	@GetMapping(path="/view-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse viewProduct(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		ProductInfo product=service.getProduct(id);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/view-allorder",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse viewAllProducts() {
		OrderResponse response = new OrderResponse();
		List<OrderInfo> list=service.getOrder();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No Order data");
		}
		return response;
		
	}
	@PutMapping(path="/update",
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
    public UserResponse modifycustomer(@RequestParam("id") int id,@RequestParam("password") String password) {
		UserResponse response = new UserResponse();
    	if(service.changePassword(id, password)) {
    		response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password Updated...");	
    	}else {
    		response.setStatusCode(401);
			response.setMessage("Failure");	
			response.setDescription("Password not updated!!!");
    	}
    	return response;
    }
	
	@GetMapping(path="/total-amount",produces = MediaType.APPLICATION_JSON_VALUE)
	public TotalResponse viewAmount(@RequestParam("id") int id) {
		TotalResponse response = new TotalResponse();
		ProductInfo product=service.getProduct(id);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Total Amount : ");
			response.setTotal(100.2345*2*id);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Id does not exist");
		}
		return response;
	}
}