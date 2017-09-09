package com.ylf.designpattern.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合类型的实现类
 * @author Jerry
 *
 */
public class MyList implements Iterable {
	
	private List<Object> elements = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Iterator createDescIterator() {
		return new ConcreteDescIterator(this);
	}
	
	public int count() {
		return elements.size();
	}
	
	public List<Object> getElements() {
		return elements;
	}
	
	public void setElements(List<Object> elements) {
		this.elements = elements;
	}

}
