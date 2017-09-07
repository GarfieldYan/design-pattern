package com.ylf.designpattern.structural.Adapter;

/**
 * 适配器类，通过继承方式实现，将Adaptee类的接口适配成用户想要的接口
 * @author Jerry
 *
 */
public class Adapter1 extends Adaptee implements Target {
	
	public void request() {
		specificRequest();
	}
	
}
