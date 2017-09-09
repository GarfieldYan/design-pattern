package com.ylf.designpattern.behavioral.Command;

/**
 * 具体请求类型1
 * @author Jerry
 *
 */
public class ConcreteCommand1 extends Command {
	
	public ConcreteCommand1(Handler handler) {
		super(handler);
	}

	@Override
	public void executeConcreteCommand() {
		handler.handleRequestType1();
	}

}
