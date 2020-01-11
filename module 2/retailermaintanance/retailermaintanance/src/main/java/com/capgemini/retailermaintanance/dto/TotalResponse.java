package com.capgemini.retailermaintanance.dto;

import java.util.List;

import lombok.Data;
@Data
public class TotalResponse {
	private int statusCode;
	private String message;
	private String description;
	private double total;
}
