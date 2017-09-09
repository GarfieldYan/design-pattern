package com.ylf.designpattern.behavioral.State;

public class ConcreteStateB implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Context处于状态B, 以B的行为方式进行处理");
	}

}
