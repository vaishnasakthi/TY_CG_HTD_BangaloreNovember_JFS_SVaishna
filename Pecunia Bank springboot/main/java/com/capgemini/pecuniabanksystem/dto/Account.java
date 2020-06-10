package com.capgemini.pecuniabanksystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="account_info")
public class Account {

	@Id
	@Column
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountId;
	@Column(nullable=false)
	private String customerName;
	@Column(nullable=false)
	private long customerContactNo;
	@Column(nullable=false)
	private String customerAddress;
	@Column(nullable=false)
	private String country;
	@Column(nullable=false)
	private String state;
	@Column(nullable=false)
	private String city;
	@Column(nullable=false)
	private int zipCode;
	@Column(nullable=false)
	private String customerAadhar;
	@Column(nullable=false)
	private String customerPAN;
	@Column(nullable=false)
	private String customerDOB;
	@Column(nullable=false)
	private String customerGender;
	

}
