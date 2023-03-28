package com.sadhak.springboot.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadhak.springboot.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	Employee findByName(String name);

}
