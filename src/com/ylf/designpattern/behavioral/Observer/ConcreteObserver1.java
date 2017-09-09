package com.ylf.designpattern.behavioral.Observer;

public class ConcreteObserver1 implements Observer {

	private Object state;

	public Object getState() {
		return state;
	}

	@Override
	public void update(Observable subject, Object state) {
		this.state = state;
		System.out.println("观察者1收到变化：" + state + "，执行一些操作");
	}

}
