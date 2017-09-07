package com.ylf.designpattern.structural.Adapter;

/**
 * 适配器模式，将一个类的接口转换成想要的另一个接口，使得原本由于接口不兼容而不能一起工作的类可以一起工作
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Target target1 = new Adapter1();
		target1.request();
		
		Target target2 = new Adapter2();
		target2.request();
	}

}
