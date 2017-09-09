package com.ylf.designpattern.behavioral.TemplateMethod;

public class ConcreteClass extends AbstractClass {

	@Override
	public void operation1() {
		System.out.println("operation1的具体实现");
	}

	@Override
	public void operation2() {
		System.out.println("operation2的具体实现");
	}

	@Override
	public void operation3() {
		System.out.println("operation3的具体实现");
	}

}
