package com.ylf.designpattern.structural.Composite;

/**
 * 为单个对象和组合对象声明接口
 * @author Jerry
 *
 */
public abstract class Component {
	
	private String name;
	
	public Component() {
		super();
	}

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract void display(int depth);
	
}
