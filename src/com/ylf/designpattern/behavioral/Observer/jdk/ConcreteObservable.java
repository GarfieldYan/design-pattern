package com.ylf.designpattern.behavioral.Observer.jdk;

import java.util.Observable;

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
