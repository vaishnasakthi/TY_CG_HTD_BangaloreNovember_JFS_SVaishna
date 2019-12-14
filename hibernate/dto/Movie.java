package com.capg.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	
@Id
@Column
private int mid;
@Column
private String mname;
@Column
private String mrating;

public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getMrating() {
	return mrating;
}
public void setMrating(String mrating) {
	this.mrating = mrating;
}

}
