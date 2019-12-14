package com.capg.jpawithhibernate.manytomany;
import com.capg.jpawithhibernate.onetoone.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="Training_Info")
public class Training {
	@Id
	@Column
private int tid;
	@Column
private String tname;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="traning_employee",
joinColumns=@JoinColumn(name="tid"),
inverseJoinColumns=@JoinColumn(name="eid"))
private List<Employee> eList;

}
