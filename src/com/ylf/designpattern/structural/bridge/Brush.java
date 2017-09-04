package com.ylf.designpattern.structural.bridge;

/**
 * 画笔抽象主类，代表了类的抽象部分，此类作为"桥"，连接类的各个不同维度的实现部分
 * 
 * @author Jerry
 *
 */
public abstract class Brush {
	//连接实现部分维度1
	protected Color color;
	//连接实现部分维度2
	protected Shape shape;
	
	public Brush() {
		this.color = new BlackColor();
		this.shape = new CircleShape();
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public abstract String useBrush();

	public void draw() {
		System.out.println("用"+useBrush()+"开始画"+color.useColor()+"的"+shape.useShape());
	}
	
}