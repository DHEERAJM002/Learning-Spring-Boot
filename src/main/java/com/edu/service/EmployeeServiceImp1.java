package com.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Employee;
import com.edu.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp1 implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeRepository.save(employee);
	}

}
