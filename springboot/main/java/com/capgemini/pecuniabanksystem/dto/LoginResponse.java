package com.capgemini.pecuniabanksystem.dto;

import lombok.Data;

@Data
public class LoginResponse {
	private int statusCode;
	private String message;
	private String description;
	private Login bean;
	
}
