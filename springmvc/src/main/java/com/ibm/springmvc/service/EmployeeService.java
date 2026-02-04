package com.ibm.springmvc.service;

import java.util.List;

import com.ibm.springmvc.model.Employee;

public interface EmployeeService {
	public void insertEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);
	
	Employee findById(Integer id);

	Employee findByEmail(String email);

	Employee findByPhone(String phone);

	List<Employee> findAll();
}
