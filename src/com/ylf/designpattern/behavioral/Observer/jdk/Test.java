package com.ylf.designpattern.behavioral.Observer.jdk;

import com.ylf.designpattern.behavioral.Observer.ConcreteObservable;
import com.ylf.designpattern.behavioral.Observer.ConcreteObserver1;
import com.ylf.designpattern.behavioral.Observer.ConcreteObserver2;
import com.ylf.designpattern.behavioral.Observer.Observer;

/**
 * 利用JDK自带的观察者接口和被观察者接口实现观察者模式
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		// 定义2个观察者
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		// 定义1个被观察者，并添加观察者
		ConcreteObservable observable = new ConcreteObservable();
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		// 改变被观察者的状态
		observable.setState("新状态1");
	}

}
