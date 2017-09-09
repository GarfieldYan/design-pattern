package com.ylf.designpattern.behavioral.State;

/**
 * 状态模式，允许一个对象当其内部状态改变时，其行为也跟着改变
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		State stateA = new ConcreteStateA();
		State stateB = new ConcreteStateB();
		Context context = new Context();
		//context状态为A，则表现为A的行为
		context.setState(stateA);
		context.request();
		//context状态为B，调用同一个接口，却可以表现为B的行为
		context.setState(stateB);
		context.request();
	}

}
