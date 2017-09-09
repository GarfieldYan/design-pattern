package com.ylf.designpattern.behavioral.State;

/**
 * 状态接口
 * @author Jerry
 *
 */
public interface State {

	//定义状态对应的行为
	public void handle(Context context);
	
}
