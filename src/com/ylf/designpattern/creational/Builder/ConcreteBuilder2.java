package com.ylf.designpattern.creational.Builder;

public class ConcreteBuilder2 extends Builder {
	
	@Override
	public void buildPartA() {
		product.setA("(A created by Builder2)");
	}

	@Override
	public void buildPartB() {
		product.setB("(B created by Builder2)");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
