package com.ylf.designpattern.behavioral.Iterator;

/**
 * 具体迭代器类型，正向迭代器
 * @author Jerry
 *
 */
public class ConcreteIterator implements Iterator {
	
	private MyList myList;
	
	private int current = 0;
	
	public ConcreteIterator(MyList myList) {
		super();
		this.myList = myList;
	}

	@Override
	public Object first() {
		return myList.getElements().get(0);
	}

	@Override
	public Object next() {
		Object next = null;
		if (current < myList.count()) {
			next = myList.getElements().get(current);
		}
		current++;
		return next;
	}

	@Override
	public boolean hasNext() {
		return current < myList.count() ? true : false;
	}

}
