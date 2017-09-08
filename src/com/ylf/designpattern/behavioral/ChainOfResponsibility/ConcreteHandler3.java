package com.ylf.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandler3 extends Handler {
	
	public ConcreteHandler3() {
		super();
	}

	public ConcreteHandler3(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(String requestType) {
		if ("request2".equals(requestType)) {
			System.out.println("request is processed by ConcreteHandler2");
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(requestType);
			}
		}
	}

}
