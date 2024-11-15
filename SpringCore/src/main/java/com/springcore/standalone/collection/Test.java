package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/Standalone_config.xml");

		Person person = (Person) context.getBean("person1", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("----------------------------------------------------------------");
		System.out.println(person.getFees_structure());
		System.out.println(person.getFees_structure().getClass().getName());
		System.out.println("----------------------------------------------------------------");
		System.out.println(person.getProperties());

		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");

		Person person2 = (Person) context.getBean("person2");
		System.out.println(person2);
	}

}
