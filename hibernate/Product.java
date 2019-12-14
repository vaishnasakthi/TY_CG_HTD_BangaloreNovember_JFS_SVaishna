package com.capg.jpawithhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
@Id
@Column
private int pid;
@Column
private String pname;
}
