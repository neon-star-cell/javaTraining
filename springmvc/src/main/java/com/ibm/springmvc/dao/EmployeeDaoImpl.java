package com.ibm.springmvc.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
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
		return jdbcTemplate.update("INSERT INTO employee(name, phone, email) VALUES (?,?,?)", e.getName(), e.getPhone(),
				e.getEmail());
	}

	@Override
	public int update(Employee e) {
		System.out.println(e.getEmail());
		return jdbcTemplate.update("UPDATE employee SET name=?, phone=?, email=? WHERE id=?", e.getName(), e.getPhone(),
				e.getEmail(), e.getId());
	}

	@Override
	public int delete(Employee e) {
		return jdbcTemplate.update("DELETE FROM employee WHERE id=?", e.getId());
	}

	@Override
	public Employee findById(Integer id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id=?", new EmployeeRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Employee findByEmail(String email) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE email=?", new EmployeeRowMapper(), email);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Employee findByPhone(String phone) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE phone=?", new EmployeeRowMapper(), phone);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());
	}

}
