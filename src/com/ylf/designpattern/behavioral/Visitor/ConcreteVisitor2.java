package com.ylf.designpattern.behavioral.Visitor;

/**
 * 访问者2
 * @author Jerry
 *
 */
public class ConcreteVisitor2 implements Visitor {

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		System.out.print("访问者2正在");
		concreteElement1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		System.out.print("访问者2正在");
		concreteElement2.doSomething();
	}

}
