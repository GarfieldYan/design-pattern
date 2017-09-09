package com.ylf.designpattern.behavioral.Observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver2 implements Observer {
	
	private Object state;
	
	public Object getState() {
		return state;
	}

	@Override
	public void update(Observable subject, Object state) {
		this.state = state;
		System.out.println("观察者2收到变化：" + state + "，执行一些操作");
	}

}
