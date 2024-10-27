package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref_config.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getA());
		
		System.out.println(temp.getOb().getY());
		System.out.println(temp);
	}
}
