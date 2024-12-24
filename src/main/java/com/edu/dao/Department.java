package com.edu.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmenttId;
	private String departmentName;
	private String departmentLocation;
	public Department(String departmentName, String departmentLocation) {
		super();
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmenttId=" + departmenttId + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + "]";
	}
	public Integer getDepartmenttId() {
		return departmenttId;
	}
	public void setDepartmenttId(Integer departmenttId) {
		this.departmenttId = departmenttId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
}
