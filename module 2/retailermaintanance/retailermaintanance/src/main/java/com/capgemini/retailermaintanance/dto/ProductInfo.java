package com.capgemini.retailermaintanance.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class ProductInfo {
	
	public class Product {
		@Id
		@GeneratedValue
		@Column(unique=true,nullable=false)
		private int id;
		
		@Column
		private int user_id;// foreign key
		
		@Column(unique=true)
		private String name;
		
		@Column
		private int quantity;
		
		@Column
		private String details;
		
		@OneToMany(cascade=CascadeType.ALL,mappedBy="prodBean")
		private List<OrderInfo> orderBean;
		
		@JsonIgnore
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="id",referencedColumnName="user_id")//since id is already present
		private UserInfo bean;
	}
}
