package com.ylf.designpattern.creational.FactoryMethod;

public class ConcreteCreator1 implements Creator {

	@Override
	public Product makeProduct() {
		return new ConcreteProduct1();
	}

}
