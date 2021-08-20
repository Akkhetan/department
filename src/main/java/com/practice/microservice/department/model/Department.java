package com.practice.microservice.department.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptID;
	private String deptName;
	
	
	public Department() {
		
	}	

	public Department(Long deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public Long getDeptID() {
		return deptID;
	}

	public void setDeptID(Long deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}	

}
