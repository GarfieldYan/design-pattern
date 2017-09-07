package com.ylf.designpattern.creational.FactoryMethod;

public class Test {

	public static void main(String[] args) {
		Creator creator1 = new ConcreteCreator1();
		creator1.makeProduct().call();
		
		// 调用工厂方法的不同实现类，生产不同的Product对象
		Creator creator2 = new ConcreteCreator2();
		creator2.makeProduct().call();
	}

}
