package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
