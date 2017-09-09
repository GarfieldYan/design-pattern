package com.ylf.designpattern.behavioral.Visitor;

/**
 * 元素类型2
 * @author Jerry
 *
 */
public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("执行元素2的操作");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
