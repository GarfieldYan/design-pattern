package com.ylf.designpattern.creational.AbstractFactory;

/**
 * 抽象工厂模式，提供一个创建一系列相关或互相依赖的对象的接口，而无需指定这些对象的具体类型
 * 
 * @author Jerry
 */
public class Test {

	public static void main(String[] args) {
		Factory factory1 = new ConcreteFactory1();
		ProductA a1 = factory1.getProductA();
		a1.productAFunction();
		ProductB b1 = factory1.getProductB();
		b1.productBFunction();
		// 切换工厂，生产不同类型的对象
		Factory factory2 = new ConcreteFactory2();
		ProductA a2 = factory2.getProductA();
		a2.productAFunction();
		ProductB b2 = factory2.getProductB();
		b2.productBFunction();
	}

}
