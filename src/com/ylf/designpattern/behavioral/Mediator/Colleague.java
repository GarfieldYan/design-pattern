package com.ylf.designpattern.behavioral.Mediator;

public abstract class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	
	/**
	 * 同事状态发生改变，通知中介者，请求协调
	 */
	public void change() {
		mediator.cooperate(this);
	}
	
	/**
	 * 同事类的具体操作
	 */
	public abstract void action();
	
}
