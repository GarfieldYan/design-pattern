package com.ylf.designpattern.creational.Builder;

/**
 * 负责管理Builder组装对象的过程
 * 
 * @author Jerry
 *
 */
public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildPartA();
		builder.buildPartB();
	}
	
}
