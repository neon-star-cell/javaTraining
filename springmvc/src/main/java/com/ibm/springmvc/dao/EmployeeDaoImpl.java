package com.ibm.springmvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO employee(name, phone, email) VALUES (?,?,?)", e.getName(),
				e.getPhone(), e.getEmail());
	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
