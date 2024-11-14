package com.springcore.lifecycle;

public class Emp {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Setting Salary.");
		this.salary = salary;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [salary=" + salary + "]";
	}

	// public void init() {
	public void hey() {
		System.out.println("Inside init method.");
	}

	public void destroy() {
		System.out.println("Inside destroy method.");
	}
}
