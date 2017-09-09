package com.ylf.designpattern.behavioral.Memento.white;

/**
 * 备忘录，存储原始对象的状态
 * 白盒模式，对所有对象都提供宽松接口，即允许访问返回到先前状态所需的所有数据。设计简单，但安全性低
 * @author Jerry
 *
 */
public class Memento {
	
	private String state;
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
