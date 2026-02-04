package com.ibm.springmvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.mapper.EmployeeRowMapper;
import com.ibm.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO employee(name, phone, email) VALUES (?,?,?)", e.getName(),
				e.getPhone(), e.getEmail());
	}

	@Override
	public int update(Employee e) {
		return jdbcTemplate.update("UPDATE employee SET name=?, phone=?, email=? WHERE email=?", e.getName(),
				e.getPhone(), e.getEmail(), e.getEmail());
	}

	@Override
	public int delete(Employee e) {
		return jdbcTemplate.update("DELETE FROM employee WHERE id=?", e.getId());
	}
	
	@Override
	public Employee findById(Integer id) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id=?", new EmployeeRowMapper(), id);
	}

	@Override
	public Employee findByEmail(String email) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE email=?", new EmployeeRowMapper(), email);
	}
	
	@Override
	public Employee findByPhone(String phone) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE phone=?", new EmployeeRowMapper(), phone);
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());
	}

}
