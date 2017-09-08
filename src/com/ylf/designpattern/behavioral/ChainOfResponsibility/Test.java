package com.ylf.designpattern.behavioral.ChainOfResponsibility;

/**
 * 职责链模式，使多个对象都有机会处理请求，从而避免请求的发送者和处理者之间的耦合关系
 * 将请求的处理者连成一条链，沿着这条链传递请求，直到有一个对象处理它为止，或者每个处理者都处理一部分请求。
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		//开始处理请求
		handler1.handleRequest("request1");
		handler1.handleRequest("request2");
		handler1.handleRequest("request3");
		handler1.handleRequest("request4");
	}

}
