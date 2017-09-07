package com.ylf.designpattern.creational.AbstractFactory;

public class ConcreteFactory2 implements Factory {

	@Override
	public ProductA getProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public ProductB getProductB() {
		return new ConcreteProductB2();
	}

}
