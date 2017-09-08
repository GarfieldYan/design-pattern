package com.ylf.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandler2 extends Handler {
	
	public ConcreteHandler2() {
		super();
	}

	public ConcreteHandler2(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(String requestType) {
		if ("request3".equals(requestType)) {
			System.out.println("request is processed by ConcreteHandler3");
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(requestType);
			}
		}
	}

}
