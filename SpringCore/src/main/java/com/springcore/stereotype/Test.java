package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype.xml");
		Student student = con.getBean("student", Student.class);
		// Student student = con.getBean("ob", Student.class);
		System.out.println(student);
		
		//Collection
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
	}

}