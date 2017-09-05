package com.ylf.designpattern.structural.Decorator;

/**
 * 此类的对象可通过装饰器动态添加新功能
 * 
 * @author Jerry
 *
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("普通操作");
	}

}
