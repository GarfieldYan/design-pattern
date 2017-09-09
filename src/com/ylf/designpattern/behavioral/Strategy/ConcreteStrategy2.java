package com.ylf.designpattern.behavioral.Strategy;

/**
 * 具体策略2
 * @author Jerry
 *
 */
public class ConcreteStrategy2 implements Strategy {

	@Override
	public void algorithm(String param) {
		System.out.println("正在通过算法2处理参数" + param);
	}

}
