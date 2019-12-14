package com.capg.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capg.jpawithhibernate.onetoone.Employee;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Experience")
public class EmployeeExperience {
	@Id
	@Column
	private int expId;
	@Column	
	private String cname;
	@Column
	private int noOfYears;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee;
}
