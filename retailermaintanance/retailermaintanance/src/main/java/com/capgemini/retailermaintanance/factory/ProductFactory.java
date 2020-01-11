package com.capgemini.retailermaintanance.factory;

import com.capgemini.retailermaintanance.dao.ProductDAO;
import com.capgemini.retailermaintanance.dao.ProductDAOImpl;
import com.capgemini.retailermaintanance.service.ProductService;
import com.capgemini.retailermaintanance.service.ProductServiceImpl;

public class ProductFactory {
public ProductFactory() {
	
}
	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao =new ProductDAOImpl();
		return dao;
	}
	public static ProductService instanceOfProductServices() {
		ProductService services =new ProductServiceImpl();
	    return services;
}
}

