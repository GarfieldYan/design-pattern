package com.ylf.designpattern.behavioral.TemplateMethod;

/**
 * 模板方法模式，定义一个操作中的处理逻辑的框架，将一些步骤的具体实现细节延迟到子类中去实现
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		AbstractClass cls = new ConcreteClass();
		cls.templateMethod();
	}

}
