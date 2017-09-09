package com.ylf.designpattern.behavioral.Command;

/**
 * 命令模式，解耦请求者和处理者，将一个请求封装成一个对象，支持对请求排队、记录日志、撤销和恢复请求等各种功能。
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Handler handler = new Handler();
		Invoker invoker = new Invoker();
		Command command1 = new ConcreteCommand1(handler);
		invoker.setCommand1(command1);
		Command command2 = new ConcreteCommand2(handler);
		invoker.setCommand2(command2);
		Command command3 = new ConcreteCommand3(handler);
		invoker.setCommand3(command3);
		
		invoker.request1();
		invoker.request2();
		invoker.request3();
	}

}
