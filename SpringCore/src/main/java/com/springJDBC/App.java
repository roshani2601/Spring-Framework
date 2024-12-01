package com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program....");
		// spring JDBC => JDBC Template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springJDBC/Config.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		// Insert
		String query = "insert into student (id,name,city) values(?,?,?)";

		int result = template.update(query, 7, "Shivangi", "Dhrol");
		
		System.out.println("Number of record inserted! " + result);
	}
}
