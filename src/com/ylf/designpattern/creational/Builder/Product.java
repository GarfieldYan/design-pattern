package com.ylf.designpattern.creational.Builder;

public class Product {
	
	private String a;
	
	private String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Product [a=" + a + ", b=" + b + "]";
	}
	
}
