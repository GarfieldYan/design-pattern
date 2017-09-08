package com.ylf.designpattern.structural.Proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 使用JDK自带接口实现动态代理，被代理对象需实现接口，只有父接口中存在的方法才会被代理
 * 
 * @author Jerry
 */
public class DynamicProxyFactory {

	/**
	 * 动态生成代理类并返回一个代理类实例
	 * @param target 被代理对象
	 * @return 动态生成的代理类
	 */
	public Object generateProxy(Object target) {
		Class<?> cls = target.getClass();
		/*
		 * 动态生成的代理类会实现被代理对象target实现的所有接口，
		 * 并将代理类的所有方法都重写为调用第三个InvocationHandler类型参数的invoke()
		 */
		return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new DynamicProxyInvocationHandler(target));
	}
	
}

/* 动态生成的代理类例子
class $Proxy0 extends Proxy implements Subject {
	protected $Proxy0(InvocationHandler ih) {
		super(ih);
	}
	@Override
	public final void request() {
		try {
			Method m = Subject.class.getMethod("request");
			Object[] args = {};
			h.invoke(this, m, args);
		} catch(Throwable e) {
			throw new RuntimeException(e);
		}
	}
}
*/
