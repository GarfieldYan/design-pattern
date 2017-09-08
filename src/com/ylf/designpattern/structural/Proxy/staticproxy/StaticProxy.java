package com.ylf.designpattern.structural.Proxy.staticproxy;

/**
 * 静态代理，只能代理指定的真实类（此处只能代理RealSubject）
 * @author Jerry
 *
 */
public class StaticProxy implements Subject {
	
	private RealSubject realSubject;

	@Override
	public void request() {
		initRealSubject();
		preRequest();
		realSubject.request();
		postRequest();
	}
	
	protected void initRealSubject() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
	}
	
	protected void preRequest() {
		System.out.println("正在进行前期工作");
	}
	
	protected void postRequest() {
		System.out.println("正在进行后期工作");
	}

}
