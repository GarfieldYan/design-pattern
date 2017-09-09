package com.ylf.designpattern.behavioral.Strategy;

/**
 * 策略模式，将一系列的算法或解决方案封装起来，并使它们可以互相替换
 * 优点：消除程序中大量的条件语句（如if语句）
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Context context = new Context();
		//使用策略1
		context.setStrategy(new ConcreteStrategy1());
		context.process("test");
		//切换策略2
		context.setStrategy(new ConcreteStrategy2());
		context.process("test");
	}

}
