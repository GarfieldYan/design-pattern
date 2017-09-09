package com.ylf.designpattern.behavioral.State;

public class ConcreteStateA implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Context处于状态A, 以A的行为方式进行处理");
	}

}
