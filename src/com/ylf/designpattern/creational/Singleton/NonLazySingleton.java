package com.ylf.designpattern.creational.Singleton;

/**
 * 饿汉式单例模式
 * 
 * @author Jerry
 *
 */
public class NonLazySingleton {
	
	private static NonLazySingleton instance = new NonLazySingleton();
	
	private NonLazySingleton() {
	}
	
	public static NonLazySingleton getInstance() {
		return instance;
	}
	
}
