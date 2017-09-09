package com.ylf.designpattern.behavioral.Mediator;

public abstract class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	
	public void change() {
		mediator.cooperate(this);
	}
	
	public abstract void action();
	
}
