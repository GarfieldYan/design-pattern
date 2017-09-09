package com.ylf.designpattern.behavioral.Iterator;

/**
 * 集合类型的接口
 * @author Jerry
 *
 */
public interface Iterable {
	
	//FactoryMethod
	public Iterator createIterator();
	
	//FactoryMethod
	public Iterator createDescIterator();

}
