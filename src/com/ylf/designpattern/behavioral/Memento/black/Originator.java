package com.ylf.designpattern.behavioral.Memento.black;

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
	
	/**
	 * 备忘录，存储原始对象的状态
	 * 黑盒模式，仅对原始对象提供宽松接口，对其它对象提供窄接口(无法访问内容)。设计复杂，但安全性高
	 * @author Jerry
	 *
	 */
	public class Memento {
		
		private String savedState;
		
		private Memento(String someState) {
			super();
			savedState = someState;
		}

		private String getState() {
			return savedState;
		}

		@SuppressWarnings("unused")
		private void setState(String someState) {
			this.savedState = someState;
		}
		
	}
	
}
