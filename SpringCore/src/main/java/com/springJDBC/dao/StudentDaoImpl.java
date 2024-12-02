package com.springJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

	// Update

	@Override
	public int change(Student student) {
		String query = "update student set name=?,city=? where id=?";

		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return r;
	}

	// Delete
	@Override
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	// selecting single student data
	@Override
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new rowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

		return student;
	}

	// Selecting all/multiple student data
	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new rowMapperImpl());
		return students;
	}

}
