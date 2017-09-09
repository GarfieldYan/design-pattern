package com.ylf.designpattern.behavioral.Visitor;

/**
 * 访问者接口，定义访问者访问不同类型的元素的具体操作
 * @author Jerry
 *
 */
public interface Visitor {
	
	public void visit(ConcreteElement1 concreteElement1);
	
	public void visit(ConcreteElement2 concreteElement2);

}
