package com.ylf.designpattern.creational.Singleton;

public class Test {

	public static void main(String[] args) {
		System.out.println(NonLazySingleton.getInstance().hashCode());
		System.out.println(NonLazySingleton.getInstance().hashCode());
		System.out.println(LazySingletonA.getInstance().hashCode());
		System.out.println(LazySingletonA.getInstance().hashCode());
		System.out.println(LazySingletonB.getInstance().hashCode());
		System.out.println(LazySingletonB.getInstance().hashCode());
	}

}
