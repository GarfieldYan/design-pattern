package com.ylf.designpattern.behavioral.Command;

/**
 * 具体请求类型2
 * @author Jerry
 *
 */
public class ConcreteCommand3 extends Command {

	public ConcreteCommand3(Handler handler) {
		super(handler);
	}

	@Override
	public void executeConcreteCommand() {
		handler.handleRequestType3();
	}

}
