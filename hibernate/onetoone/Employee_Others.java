package com.capg.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_others")
public class Employee_Others {
	@Id
	@Column
	private int id;
	@Column
	private String pan;
	@Column
	private String fatherName;
	@Column
	private String motherName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee;
}
