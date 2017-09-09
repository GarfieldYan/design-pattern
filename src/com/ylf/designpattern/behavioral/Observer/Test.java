package com.ylf.designpattern.behavioral.Observer;

/**
 * 观察者模式，定义对象间的一对多的依赖关系，当一个对象状态改变时，所有依赖于它的对象都得到通知并被自动更新
 * 优点：被观察者和观察者之间松耦合，被观察者不知道观察者属于什么类型，只知道它们是Observer类型
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		//定义2个观察者
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		//定义1个被观察者，并添加观察者
		ConcreteObservable observable = new ConcreteObservable();
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		//改变被观察者的状态
		observable.setState("新状态1");
	}

}
