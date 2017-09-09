package com.ylf.designpattern.behavioral.Command;

/**
 * 请求调用器
 * @author Jerry
 *
 */
public class Invoker {

	private Command command1;
	private Command command2;
	private Command command3;
	
	public void request1() {
		command1.execute();
	}
	
	public void request2() {
		command2.execute();
	}
	
	public void request3() {
		command3.execute();
	}
	
	public Command getCommand1() {
		return command1;
	}

	public void setCommand1(Command command1) {
		this.command1 = command1;
	}

	public Command getCommand2() {
		return command2;
	}

	public void setCommand2(Command command2) {
		this.command2 = command2;
	}

	public Command getCommand3() {
		return command3;
	}

	public void setCommand3(Command command3) {
		this.command3 = command3;
	}

}
