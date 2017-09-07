package com.ylf.designpattern.creational.SimpleFactory;

/**
 * 当你需要什么对象，只需传入一个正确的参数，就可以获取所需的对象，而无须知道其创建细节
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Product product1 = SimpleFactory.makeProduct("Product1");
		product1.call();

		Product product2 = SimpleFactory.makeProduct("Product2");
		product2.call();
	}

}
