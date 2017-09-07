package com.ylf.designpattern.structural.Adapter;

/**
 * 被适配者，没有实现用户想要的Target接口
 * @author Jerry
 *
 */
public class Adaptee {
	
	public void specificRequest() {
		System.out.println("This is an Adaptee");
	}
	
}
