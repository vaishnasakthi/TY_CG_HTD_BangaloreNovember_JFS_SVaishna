package com.capgemini.retailermaintanance.service;

import java.util.List;

import com.capgemini.retailermaintanance.dto.OrderInfo;
import com.capgemini.retailermaintanance.dto.ProductInfo;
import com.capgemini.retailermaintanance.dto.UserInfo;


public interface ProductService {
	public boolean createProfile(UserInfo user);
	public UserInfo login(String email,String password);
	public ProductInfo getProduct(int id);
	public boolean changePassword(int id,String password);
	public double totalAmt(ProductInfo product);
	public List<OrderInfo> getOrder();
}
