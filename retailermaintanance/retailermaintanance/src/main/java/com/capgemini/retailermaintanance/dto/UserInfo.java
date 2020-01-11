package com.capgemini.retailermaintanance.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class UserInfo {
	
	@Id
	@GeneratedValue
	@Column(unique=true,nullable=false)
	private int id;
	@Column
	private String name;
	@Column(unique=true)
	private String email;
	@Column
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="bean")
	private List<ProductInfo> productBean;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="bean1")
	private List<OrderInfo> orderBean;
}

