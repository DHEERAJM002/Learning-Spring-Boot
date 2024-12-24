package com.edu.service;

import java.util.List;

import com.edu.dao.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartments();

	public Department getDepartmentById(Integer deptId);

	public List<Department> deleteDepartmentById(Integer deptId);

	public Department updateDepartmentById(Integer deptId,Department department);

}
