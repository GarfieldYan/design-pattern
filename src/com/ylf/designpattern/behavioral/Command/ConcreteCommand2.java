package com.ylf.designpattern.behavioral.Command;

/**
 * 具体请求类型2
 * 
 * @author Jerry
 *
 */
public class ConcreteCommand2 extends Command {

	public ConcreteCommand2(Handler handler) {
		super(handler);
	}

	@Override
	public void executeConcreteCommand() {
		handler.handleRequestType2();
	}

}
