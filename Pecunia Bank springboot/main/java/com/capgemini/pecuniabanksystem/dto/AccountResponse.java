package com.capgemini.pecuniabanksystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class AccountResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<Account> bean;

}
