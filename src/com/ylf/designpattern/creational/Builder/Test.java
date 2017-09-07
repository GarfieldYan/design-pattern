package com.ylf.designpattern.creational.Builder;

/**
 * 生成器模式，将一个复杂对象的构建过程与它的成品分离，使得同样的构建过程可以创建不同的成品
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Builder builder1 = new ConcreteBuilder1();
		Director director = new Director(builder1);
		director.construct();
		System.out.println(builder1.getResult());
		// 切换builder，使用不同的方式构建对象的每一部分
		Builder builder2 = new ConcreteBuilder2();
		director.setBuilder(builder2);
		director.construct();
		System.out.println(builder2.getResult());
	}

}
