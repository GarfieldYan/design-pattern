package com.ylf.designpattern.creational.FactoryMethod;

public class ConcreteCreator2 implements Creator {

	@Override
	public Product makeProduct() {
		return new ConcreteProduct2();
	}

}
