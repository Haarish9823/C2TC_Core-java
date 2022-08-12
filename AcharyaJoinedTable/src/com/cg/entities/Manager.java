package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mfr_store")
public class Manager extends Employee{


	private static final long serialVersionUID=1L;
	
	private String departmentName;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	}
