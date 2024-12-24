package com.edu.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private float employeeSalary;
	private String employeeEmail;
	private String employeePhone;
	private Date employeeJoinDate;
	private Date employeeDateOfBirth;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, float employeeSalary, String employeeEmail, String employeePhone,
			Date employeeJoinDate, Date employeeDateOfBirth) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.employeePhone = employeePhone;
		this.employeeJoinDate = employeeJoinDate;
		this.employeeDateOfBirth = employeeDateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeEmail=" + employeeEmail + ", employeePhone=" + employeePhone
				+ ", employeeJoinDate=" + employeeJoinDate + ", employeeDateOfBirth=" + employeeDateOfBirth + "]";
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public Date getEmployeeJoinDate() {
		return employeeJoinDate;
	}
	public void setEmployeeJoinDate(Date employeeJoinDate) {
		this.employeeJoinDate = employeeJoinDate;
	}
	public Date getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}
	public void setEmployeeDateOfBirth(Date employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}
	
	
}
