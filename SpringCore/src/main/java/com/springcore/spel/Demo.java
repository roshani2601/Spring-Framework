package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{1+4}")
	private int x;

	@Value("#{1+1}")
	private int y;

	// --------------------------------Static method--------------------------------
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;

	// ----------------------------------Variable----------------------------------
	// @Value("#{ T(java.lang.Math).E }")
	@Value("#{ T(java.lang.Math).PI }")
	private double e;

	// -----------------------------------Object-----------------------------------
	@Value("#{ new java.lang.String('Roshani')}")
	private String name;

	// ----------------------------------Boolean----------------------------------
	@Value("#{ 8>3 }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
