package com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program....");
		// spring JDBC => JDBC Template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springJDBC/Config.xml");

		// JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		//----------------------------------------Insert-----------------------------------------
		// String query = "insert into student (id,name,city) values(?,?,?)";

		// int result = template.update(query, 7, "Shivangi", "Dhrol");

		// System.out.println("Number of record inserted! " + result);

		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
		//-----------------------------------------Insert-----------------------------------------
		//Student student = new Student();
		//student.setId(8);
		//student.setName("Purv");
		//student.setCity("hoo");
		//int result = studentDao.insert(student);
		//System.out.println("Student added! " + student);

		// -----------------------------------------Update-----------------------------------------
		Student student = new Student();
		student.setId(5);
		student.setName("Purv");
		student.setCity("Borsadiya");
		int result = studentDao.change(student);
		System.out.println("Data updated!");
	}
}
