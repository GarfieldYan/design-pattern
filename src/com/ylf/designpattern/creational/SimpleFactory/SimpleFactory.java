package com.ylf.designpattern.creational.SimpleFactory;

public class SimpleFactory {
	
	// 此方法就是Simple Factory Method
	public static Product makeProduct(String productType) {
		switch (productType) {
		case "Product1":
			return new ConcreteProduct1();

		case "Product2":
			return new ConcreteProduct2();

		default:
			return null;
		}
	}
	
}
