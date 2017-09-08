package com.ylf.designpattern.behavioral.ChainOfResponsibility;

public abstract class Handler {
	
	protected Handler nextHandler;
	
	public Handler() {
		super();
	}

	public Handler(Handler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}
	
	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handleRequest(String requestType);
	
}
