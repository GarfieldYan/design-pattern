package com.ylf.designpattern.structural.Proxy.staticproxy;

/**
 * 被代理的接口的实现类
 * @author Jerry
 *
 */
public class RealSubject implements Subject {

	public void request() {
		System.out.println("调用真实类的方法");
	}
	
}
