package com.capg.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	
	@Exclude// exclude tostring while dealing with bidirectional
	@OneToOne(cascade=CascadeType.ALL,mappedBy="employee")
	private Employee_Others others;

}
