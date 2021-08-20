package com.practice.microservice.department.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.practice.microservice.department.model.Department;


@Repository
public interface DeptRepo extends JpaRepository<Department, Long> {

	Department findBydeptID(Long deptId);

}
