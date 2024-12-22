package com.springORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springJDBC.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	//Save student
	public int insert(Student student) {
		// insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
}
