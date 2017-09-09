package com.ylf.designpattern.behavioral.Iterator;

/**
 * 具体迭代器类型，反向迭代器
 * @author Jerry
 *
 */
public class ConcreteDescIterator implements Iterator {
	
	private MyList myList;
	
	private int current = 0;
	
	public ConcreteDescIterator(MyList myList) {
		super();
		this.myList = myList;
		current = myList.count() - 1;
	}

	@Override
	public Object first() {
		return myList.getElements().get(myList.count() - 1);
	}

	@Override
	public Object next() {
		Object next = null;
		if (current >= 0) {
			next = myList.getElements().get(current);
		}
		current--;
		return next;
	}

	@Override
	public boolean hasNext() {
		return current >= 0 ? true : false;
	}

}
