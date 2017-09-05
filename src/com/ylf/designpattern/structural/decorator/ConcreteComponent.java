package com.ylf.designpattern.structural.decorator;

/**
 * 此类的对象可通过装饰器动态添加新功能
 * 
 * @author Jerry
 *
 */
public class ConcreteComponent implements Component {

	@Override
	public void method() {
		System.out.println("普通操作");
	}

}
