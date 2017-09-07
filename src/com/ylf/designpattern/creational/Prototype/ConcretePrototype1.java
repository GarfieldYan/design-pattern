package com.ylf.designpattern.creational.Prototype;

/**
 * 浅拷贝模式子类
 * 浅拷贝: 对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象.
 * @author Jerry
 *
 */
public class ConcretePrototype1 implements Prototype, Cloneable {
	
	// 引用类型只复制引用，不复制对象
	private Object obj;
	// 值类型进行值的复制
	private int age;
	
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Object Clone() {
		ConcretePrototype1 copyOfCp1 = null;
		try {
			copyOfCp1 = (ConcretePrototype1) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copyOfCp1; 
	}

}
