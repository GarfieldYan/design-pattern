package com.ylf.designpattern.behavioral.Command;

/**
 * 请求的接口
 * 
 * @author Jerry
 *
 */
public abstract class Command {

	protected Handler handler;

	public Command(Handler handler) {
		super();
		this.handler = handler;
	}

	public void execute() {
		record();
		executeConcreteCommand();
	}
	
	protected abstract void executeConcreteCommand();
	
	public void record() {
		System.out.println("记录请求");
	}
	
	public void undo() {
		System.out.println("撤销请求");
	}
	
	public void redo() {
		System.out.println("重做请求");
	}

}
