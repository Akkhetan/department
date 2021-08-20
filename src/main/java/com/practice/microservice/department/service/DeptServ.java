package com.practice.microservice.department.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.microservice.department.model.Department;
import com.practice.microservice.department.repository.DeptRepo;


@Service
public class DeptServ {
	
	@Autowired
	private DeptRepo deptRepo;

	public Department saveDept(Department department) {
		return deptRepo.save(department);
	}
	public Department getDeptIdService(Long deptId) {
		// TODO Auto-generated method stub
		return deptRepo.findBydeptID(deptId);
	}
	
	public List<Department> getAllDeptService() {
		List<Department> deptList = new ArrayList<Department>();
		deptRepo.findAll().forEach(deptList::add);
		return deptList;
	}

}
