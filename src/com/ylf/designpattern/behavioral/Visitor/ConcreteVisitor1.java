package com.ylf.designpattern.behavioral.Visitor;

/**
 * 访问者1
 * @author Jerry
 *
 */
public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		System.out.print("访问者1正在");
		concreteElement1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		System.out.print("访问者1正在");
		concreteElement2.doSomething();
	}

}
