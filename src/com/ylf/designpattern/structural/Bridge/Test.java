package com.ylf.designpattern.structural.Bridge;

/**
 * 
 * 桥接模式
 * 优点：通过组合的方式将类的（一个或多个）抽象部分和（一个或多个）实现部分分离，使类的设计遵循单一职责原则
 * 使用场景：当类有多个维度会引起类的变化时，若采用继承的方式实现，会生成多个维度各自实现数相乘数量的子类，且每个子类职责不单一
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		//选择抽象部分的实现为小画笔
		Brush brush = new SmallBrush();
		//选择实现部分的颜色维度的实现为红色
		Color color = new RedColor();
		brush.setColor(color);
		//选择实现部分的形状维度的实现为圆形
		Shape shape = new CircleShape();
		brush.setShape(shape);
		
		brush.draw();
	}

}