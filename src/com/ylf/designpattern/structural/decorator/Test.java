package com.ylf.designpattern.structural.decorator;

/**
 * 装饰模式
 * 优点：在不影响原对象的前提下，动态给对象添加功能，添加的功能对使用者透明，因为接口不变
 * 例子：Java I/O类采用此模式设计
 * @author Jerry
 */
public class Test {

	public static void main(String[] args) {
		//调用Component类型普通对象的方法
		Component component = new ConcreteComponent();
		component.method();
		
		//给Component类型普通对象动态添加A功能
		Component componentWithA = new ConcreteDecoratorA(component);
		componentWithA.method();
		
		//给Component类型普通对象动态添加B功能
		Component componentWithB = new ConcreteDecoratorB(component);
		componentWithB.method();
	}

}
