package com.ylf.designpattern.behavioral.Observer;

import java.util.Vector;

/**
 * 被观察者
 * @author Jerry
 *
 */
public class Observable {
	
	private Vector<Observer> obs;
	
	public Observable() {
        obs = new Vector<>();
    }
	//添加观察者
	public void addObserver(Observer observer) {
		obs.add(observer);
	}
	//删除观察者
	public void deleteObserver(Observer observer) {
		obs.remove(observer);
	}
	//将自身变化通知所有观察者
	public void notifyObservers(Object state) {
		for (Observer observer : obs) {
			observer.update(this, state);
		}
	}
	
}
