package com.ylf.designpattern.structural.Proxy;

import com.ylf.designpattern.structural.Proxy.staticproxy.StaticProxy;
import com.ylf.designpattern.structural.Proxy.staticproxy.Subject;

/**
 * 代理模式，为其它对象提供一种代理，以控制对这个对象的访问
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Subject sub = new StaticProxy();
		sub.request();
	}

}
