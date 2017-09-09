package com.ylf.designpattern.behavioral.Iterator;

/**
 * 迭代器接口，定义迭代器的操作
 * @author Jerry
 *
 */
public interface Iterator {

	public Object first();
	
	public Object next();
	
	public boolean hasNext();
	
}
