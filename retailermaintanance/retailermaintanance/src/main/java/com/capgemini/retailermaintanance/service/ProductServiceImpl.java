package com.capgemini.retailermaintanance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintanance.dao.ProductDAO;
import com.capgemini.retailermaintanance.dto.OrderInfo;
import com.capgemini.retailermaintanance.dto.ProductInfo;
import com.capgemini.retailermaintanance.dto.ProductInfo.Product;
import com.capgemini.retailermaintanance.dto.UserInfo;
import com.capgemini.retailermaintanance.factory.ProductFactory;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean createProfile(UserInfo user) {
		return dao.createProfile(user);
	}

	@Override
	public UserInfo login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public ProductInfo getProduct(int id) {
		return dao.getProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

	@Override
	public double totalAmt(ProductInfo product1) {
		
		return dao.totalAmt(product1);
	}

	@Override
	public List<OrderInfo> getOrder() {
		return dao.getOrder();
	}

}
