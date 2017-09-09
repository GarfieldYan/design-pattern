package com.ylf.designpattern.behavioral.Observer;

/**
 * 观察者
 * @author Jerry
 *
 */
public interface Observer {

	/**
	 * 定义观察者接收到状态变化后需要执行的操作
	 * @param subject 被观察者
	 * @param state 新状态
	 */
	public void update(Observable subject, Object state);
	
}
