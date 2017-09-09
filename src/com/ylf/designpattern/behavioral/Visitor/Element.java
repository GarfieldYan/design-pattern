package com.ylf.designpattern.behavioral.Visitor;

/**
 * 被访问者接口
 * @author Jerry
 *
 */
public abstract class Element {
	
	//被访问者的真实操作
	public abstract void doSomething();
	
	//通过访问者来访问自己
	public abstract void accept(Visitor visitor);

}
