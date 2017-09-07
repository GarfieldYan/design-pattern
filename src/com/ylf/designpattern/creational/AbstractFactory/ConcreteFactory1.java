package com.ylf.designpattern.creational.AbstractFactory;

public class ConcreteFactory1 implements Factory {

	@Override
	public ProductA getProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ConcreteProductB1();
	}

}
