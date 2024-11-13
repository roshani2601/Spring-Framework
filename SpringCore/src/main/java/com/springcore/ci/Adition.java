package com.springcore.ci;

import javax.swing.table.TableStringConverter;

public class Adition {
	private int a;
	private int b;

	public Adition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double, double");
	}

//Spring by default constructor -> String constructor 
	public Adition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}

	public Adition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}

	public void doSum() {
		System.out.println("A : " + this.a);
		System.out.println("B : " + this.b);
		System.out.println("Sum is = " + (this.a + this.b));
	}
}
