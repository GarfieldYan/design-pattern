package com.ylf.designpattern.creational.Singleton;

/**
 * 懒汉式单例模式实现方式二
 * 
 * @author Jerry
 *
 */
public class LazySingletonB {
	
	private LazySingletonB() {
	}
	
	private static class SingletonHolder {
		public static LazySingletonB instance = new LazySingletonB();
	}
	
	public static LazySingletonB getInstance() {
		return SingletonHolder.instance;
	}
	
}
