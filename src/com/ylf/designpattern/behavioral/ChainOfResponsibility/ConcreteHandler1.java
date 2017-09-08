package com.ylf.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {
	
	public ConcreteHandler1() {
		super();
	}

	public ConcreteHandler1(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(String requestType) {
		if ("request1".equals(requestType)) {
			System.out.println("request is processed by ConcreteHandler1");
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(requestType);
			}
		}
	}

}
