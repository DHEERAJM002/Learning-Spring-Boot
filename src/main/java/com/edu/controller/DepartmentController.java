package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Department;
import com.edu.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	//@PostMapping->Save or Insert record
	//@PutMapping->Update record
	//@DeleteMapping->Delete record
	//@GetMapping->Fetch record
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/getAllDepartment")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	@GetMapping("/getDepartmentById/{deptId}")
	public Department getDepartmentById(@PathVariable("deptId") Integer deptId){
		return departmentService.getDepartmentById(deptId);
	}
	@DeleteMapping("/deleteDepartmentById/{deptId}")
	public List<Department> deleteDepartmentById(@PathVariable("deptId") Integer deptId) {
		return departmentService.deleteDepartmentById(deptId);
	}
	@PutMapping("/updateById/{deptId}")
	public Department updateDepartmentById(@PathVariable("deptId") Integer deptId,@RequestBody Department department) {
			return departmentService.updateDepartmentById(deptId,department);
	}
}
