package com.ibm.springmvc.service;

import java.util.List;

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
		employeeDao.save(employee);
		System.out.println("Employee Inserted");
	}
	
	@Override
	public void deleteEmployee(Employee employee) {
		employeeDao.delete(employee);
		System.out.println("Employee Deleted");
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.update(employee);
	}
	
	@Override
	public Employee findById(Integer id) {
		return employeeDao.findById(id);
	}
	
	@Override
	public Employee findByEmail(String email) {
		return employeeDao.findByEmail(email);
	}
	
	@Override
	public Employee findByPhone(String phone) {
		return employeeDao.findByPhone(phone);
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
}
