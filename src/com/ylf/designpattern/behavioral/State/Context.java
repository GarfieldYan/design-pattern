package com.ylf.designpattern.behavioral.State;

/**
 * 此对象的request行为随便状态的改变而不同
 * @author Jerry
 *
 */
public class Context {
	
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void request() {
		if (state != null) {
			state.handle(this);
		}
	}

}
