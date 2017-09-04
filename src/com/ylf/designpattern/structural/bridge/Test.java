package com.ylf.designpattern.structural.bridge;

/**
 * 
 * 桥接模式
 * 优点：通过组合的方式将类的抽象部分和实现部分分离，使类的设计遵循单一职责原则
 * 使用场景：当类有多个维度会引起类的变化时，若采用继承的方式实现，会生成多个维度各自实现数相乘数量的子类，且每个子类职责不单一
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Color color = new RedColor();
		Shape shape = new CircleShape();
		Brush brush = new SmallBrush();
		brush.setColor(color);
		brush.setShape(shape);
		brush.draw();
	}

}