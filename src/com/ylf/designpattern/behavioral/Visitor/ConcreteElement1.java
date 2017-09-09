package com.ylf.designpattern.behavioral.Visitor;

/**
 * 元素类型1
 * @author Jerry
 *
 */
public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() {
		System.out.println("执行元素1的操作");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
