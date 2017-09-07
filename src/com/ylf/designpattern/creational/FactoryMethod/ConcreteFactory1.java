package com.ylf.designpattern.creational.FactoryMethod;

public class ConcreteFactory1 implements Factory {

	@Override
	public Product makeProduct() {
		return new ConcreteProduct1();
	}

}
