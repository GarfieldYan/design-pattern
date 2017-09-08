package com.ylf.designpattern.structural.Flyweight;

/**
 * 享元模式，复用内存中已存在的对象，降低系统创建对象实例的性能消耗
 * 例子：Java的String类的设计。当String对象（享元对象）的值（内部状态）相同时，不会重复创建实例，而是引用到池中的同一对象
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Flyweight f1, f2, f3;
		FlyweightFactory factory = new FlyweightFactory();
		//创建内部状态为"aaa"的享元对象
		f1 = factory.getConcreteFlyweight("aaa");
		//创建内部状态为"bbb"的享元对象
		f2 = factory.getConcreteFlyweight("bbb");
		System.out.println(f1 == f2);
		
		//因为内部状态相同，因此不创建新对象，而是将f3指向f1指向的享元对象
		f3 = factory.getConcreteFlyweight("aaa");
		System.out.println(f1 == f3);
	}

}
