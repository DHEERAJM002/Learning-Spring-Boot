package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Department;
import com.edu.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp1 implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	@Override
	public Department getDepartmentById(Integer deptId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(deptId).get();
	}
	@Override
	public List<Department> deleteDepartmentById(Integer deptId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(deptId);
		return departmentRepository.findAll();
	}
	@Override
	public Department updateDepartmentById(Integer deptId,Department department) {
		// TODO Auto-generated method stub
		Department dept=departmentRepository.findById(deptId).get();
		if(dept!=null) {
			dept.setDepartmentName(department.getDepartmentName());
			dept.setDepartmentLocation(department.getDepartmentLocation());
			departmentRepository.save(dept);
			
		}
		else
			System.out.println("Record not found");
		return dept;
	}

}
