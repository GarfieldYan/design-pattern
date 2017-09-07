package com.ylf.designpattern.creational.Builder;

public class ConcreteBuilder1 extends Builder {
	
	@Override
	public void buildPartA() {
		product.setA("(A created by Builder1)");
	}

	@Override
	public void buildPartB() {
		product.setB("(B created by Builder1)");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
