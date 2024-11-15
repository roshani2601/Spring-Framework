package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	// Property injection
	// @Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	// Setter
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Contsructor injection
	// @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor.");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
