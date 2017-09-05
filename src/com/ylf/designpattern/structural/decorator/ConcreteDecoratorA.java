package com.ylf.designpattern.structural.decorator;

/**
 * 添加A功能的装饰器
 * 
 * @author Jerry
 *
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		component.operation();
		System.out.println("添加额外A功能");
	}

}
