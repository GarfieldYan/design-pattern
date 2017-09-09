package com.ylf.designpattern.behavioral.TemplateMethod;

public abstract class AbstractClass {

	public void templateMethod() {
		operation1();
		operation1();
		operation1();
	}

	public abstract void operation1();

	public abstract void operation2();

	public abstract void operation3();

}
