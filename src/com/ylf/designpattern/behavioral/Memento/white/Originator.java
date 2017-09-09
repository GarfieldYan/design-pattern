package com.ylf.designpattern.behavioral.Memento.white;

/**
 * 原始对象，可通过创建、恢复备忘录来保存和恢复状态
 * @author Jerry
 *
 */
public class Originator {
	
	private String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
}
