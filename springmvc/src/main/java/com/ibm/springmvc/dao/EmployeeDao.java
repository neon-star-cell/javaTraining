package com.ibm.springmvc.dao;

import java.util.List;

import com.ibm.springmvc.model.Employee;

public interface EmployeeDao {
	int save(Employee e);

	int update(Employee e);

	int delete(Employee e);

	Employee findByEmail(String email);
	
	Employee findByPhone(String phone);
	
	Employee findById(Integer id);

	List<Employee> findAll();
}
