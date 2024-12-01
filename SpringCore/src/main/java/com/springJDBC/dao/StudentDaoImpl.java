package com.springJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// Insert
		String query = "insert into student (id,name,city) values(?,?,?)";

		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
