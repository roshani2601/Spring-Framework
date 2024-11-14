package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Using_annotation {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Using_annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Using_annotation [name=" + name + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Annotation - init");
	}

	@PreDestroy
	public void end() {
		System.out.println("Annotation - destroy");
	}
}
