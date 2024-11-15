package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// @Component("ob")
public class Student {
	@Value("Roshani")
	private String studentname;
	@Value("Surat")
	private String city;

	// Colletion
	
	@Value("#{temp}")
	private List<String> address;

	public String getStudentname() {
		return studentname;
	}

	public void setStudenyname(String studentname) {
		this.studentname = studentname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + "]";
	}

}
