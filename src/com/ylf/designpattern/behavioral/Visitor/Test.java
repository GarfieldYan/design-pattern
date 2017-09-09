package com.ylf.designpattern.behavioral.Visitor;

/**
 * 访问者模式，把数据结构和作用于结构上的（访问）操作解耦，使（访问）操作的种类可以自由变化
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElement1());
		objectStructure.add(new ConcreteElement2());
		Visitor visitor1 = new ConcreteVisitor1();
		objectStructure.action(visitor1);
		Visitor visitor2 = new ConcreteVisitor2();
		objectStructure.action(visitor2);
	}

}
