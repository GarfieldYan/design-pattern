package com.ylf.designpattern.creational.Singleton;

/**
 * 懒汉式单例模式实现方式一，采用DCL配合volatile实现（JDK5后有效，因为volatile变量在JDK5后禁止进行指令重排序）
 * 
 * @author Jerry
 *
 */
public class LazySingletonA {
	
	private volatile static LazySingletonA instance;
	
	private LazySingletonA() {
	}
	
	public static LazySingletonA getInstance() {
		/*
		 * JDK5之前，若线程A到达此处时，线程B有可能已经在执行instance = new LazySingletonA()，
		 * 但只创建了空对象，还没调用<init>方法对对象进行初始化，此时线程A对象会直接返回此尚未初始化的instance。
		 * 
		 * JDK5之后，volatile关键字添加了禁止指令重排序的语义，
		 * 因此线程A对对象的读取操作会等到线程B对对象的写入操作完成之后才能进行，因此保证了线程安全
		 */
		if (instance == null) {
			synchronized(LazySingletonA.class) {
				// double-check的原因：若线程A和线程B同时争夺锁，假设线程A获取锁后创建对象，线程B之后再进入如果不double-check，会导致重复创建实例
				if (instance == null) {
					instance = new LazySingletonA();
				}
			}
		}
		return instance;
	}
	
}
