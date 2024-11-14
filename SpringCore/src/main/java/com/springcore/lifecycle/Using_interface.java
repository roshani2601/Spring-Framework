package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// InitializingBean -> init method ,DisposableBean -> Destroy method
public class Using_interface implements InitializingBean, DisposableBean {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Using_interface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Using_interface [salary=" + salary + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("Interface --- Init Method.");
	}

	@Override
	public void destroy() throws Exception {
		// Destroy method
		System.out.println("Interface --- Destroy Method.");

	}

}
