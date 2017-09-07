package com.ylf.designpattern.creational.Builder;

/**
 * 对象各部分的创建过程
 * @author Jerry
 *
 */
public abstract class Builder {
	
	protected Product product;
	
	public Builder() {
		super();
		this.product = new Product();
	}

	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract Product getResult();
	
}
