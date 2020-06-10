package com.capgemini.pecuniabanksystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="login_info")
public class Login {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	@Column
	private String userName;
	@Column
	private String password;


}
