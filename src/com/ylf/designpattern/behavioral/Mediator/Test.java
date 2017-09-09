package com.ylf.designpattern.behavioral.Mediator;

/**
 * 中介者模式，用一个中介对象来封装一系列的对象交互
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague colleague1 = mediator.getColleague1();
		Colleague colleague2 = mediator.getColleague2();
		colleague1.change();	// 同事1状态发生改变，请求中介者进行协调
		colleague2.change();	// 同事2状态发生改变，请求中介者进行协调
	}

}
