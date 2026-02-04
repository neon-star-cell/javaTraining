package com.ibm.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvc.dao.EmployeeDao;
import com.ibm.springmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		System.out.println("Employee Inserted");
	}
}
