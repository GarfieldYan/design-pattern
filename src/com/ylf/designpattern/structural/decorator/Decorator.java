package com.ylf.designpattern.structural.decorator;

/**
 * 装饰器，可以是抽象类，和被装饰对象实现同一个接口，借此隐藏自己的装饰者身份，因为对于使用者来说接口不变
 * 
 * @author Jerry
 *
 */
public abstract class Decorator implements Component {
	
	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public abstract void operation();

}
