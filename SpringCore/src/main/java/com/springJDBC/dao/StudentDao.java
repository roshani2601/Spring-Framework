package com.springJDBC.dao;

import java.util.List;

import com.springJDBC.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	//Single data object
	public Student getStudent(int studentId);
	//Multiple object
	public List<Student> getAllStudents();
}
