package com.practice.microservice.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservice.department.model.Department;
import com.practice.microservice.department.service.DeptServ;


@RestController
@RequestMapping("/departments")
public class DeptCont {
	
	@Autowired
	private DeptServ deptServ;
	
	
	@PostMapping("/save")
	public Department saveDept(@RequestBody Department department) {
		
		return deptServ.saveDept(department);
	}
	
	@GetMapping("/find/{id}")
	public Department findDeptId(@PathVariable("id") Long deptId) {
		return deptServ.getDeptIdService(deptId);
	}
	
	@GetMapping("/findall")
	public List<Department> findAllDept() {
		return deptServ.getAllDeptService();
	}

}
