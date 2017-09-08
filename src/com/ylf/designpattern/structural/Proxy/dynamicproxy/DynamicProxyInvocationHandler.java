package com.ylf.designpattern.structural.Proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 被代理对象target中的所有方法的调用都转换成调用此类的invoke()方法
 * @author Jerry
 *
 */
public class DynamicProxyInvocationHandler implements InvocationHandler {
	
	private Object target;	//被代理对象
	
	public DynamicProxyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 真实类的方法执行前，插入一些操作
		System.out.println("真实类的" + method.getName() + "方法调用前，插入一些前期工作");
		// 调用被代理对象的真实方法
		Object result = method.invoke(target, args);
		// 真实类的方法执行后，插入一些操作
		System.out.println("真实类的" + method.getName() + "方法调用后，插入一些后期工作");
		return result;
	}
	
}
