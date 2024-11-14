package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// --------------------------Using XML--------------------------

		// For init method
		// ApplicationContext context= new
		// ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		// For Destroy method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		/*
		 * Emp e = (Emp) context.getBean("e1"); System.out.println(e);
		 */

		// Destroy -> AbstractApplicationContext ma registerShutdoeHook function aave
		context.registerShutdownHook();

		System.out.println("--------------------------------------");

		// --------------------------Using Interface--------------------------

//		Using_interface i = (Using_interface) context.getBean("i1");
//		System.out.println(i);
//
//		System.out.println("--------------------------------------");

		// --------------------------Using Interface--------------------------

		Using_annotation a = (Using_annotation) context.getBean("a1");
		System.out.println(a);
		
	}

}
