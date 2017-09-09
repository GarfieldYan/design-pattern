package com.ylf.designpattern.behavioral.Observer;

public class ConcreteObservable extends Observable {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers(state);
	}
	
}
