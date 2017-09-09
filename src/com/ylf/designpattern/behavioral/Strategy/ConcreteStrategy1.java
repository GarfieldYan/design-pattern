package com.ylf.designpattern.behavioral.Strategy;

/**
 * 具体策略1
 * @author Jerry
 *
 */
public class ConcreteStrategy1 implements Strategy {

	@Override
	public void algorithm(String param) {
		System.out.println("正在通过算法1处理参数" + param);
	}

}
