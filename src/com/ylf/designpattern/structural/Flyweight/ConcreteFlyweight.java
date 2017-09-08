package com.ylf.designpattern.structural.Flyweight;

public class ConcreteFlyweight implements Flyweight {

	private String state;	//内部状态

	public ConcreteFlyweight(String state) {
		super();
		this.state = state;
	}
	
	@Override
	public void operation() {
		System.out.println(state);
	}
	
}
