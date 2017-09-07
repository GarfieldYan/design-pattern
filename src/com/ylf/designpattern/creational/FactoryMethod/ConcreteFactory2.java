package com.ylf.designpattern.creational.FactoryMethod;

public class ConcreteFactory2 implements Factory {

	@Override
	public Product makeProduct() {
		return new ConcreteProduct2();
	}

}
