package com.ylf.designpattern.creational.FactoryMethod;

/**
 * 工厂方法模式，定义一个用于创建对象的工厂方法，让子类决定生成哪个类型的目标对象
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Factory creator1 = new ConcreteFactory1();
		creator1.makeProduct().call();
		
		// 调用工厂方法的不同实现类，生产不同的Product对象
		Factory creator2 = new ConcreteFactory2();
		creator2.makeProduct().call();
	}

}
