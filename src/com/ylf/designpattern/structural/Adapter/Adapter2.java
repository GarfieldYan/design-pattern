package com.ylf.designpattern.structural.Adapter;

/**
 * 适配器类，通过组合方式实现，将Adaptee类的接口适配成用户想要的接口
 * @author Jerry
 *
 */
public class Adapter2 extends Adaptee implements Target {
	
	private Adaptee adaptee;
	
	public Adapter2() {
		super();
	}

	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}


	public void request() {
		adaptee.specificRequest();
	}
	
}
