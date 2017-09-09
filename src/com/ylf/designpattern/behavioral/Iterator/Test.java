package com.ylf.designpattern.behavioral.Iterator;

import java.util.Arrays;
import java.util.List;

/**
 * 迭代器模式，提供一种方法顺序访问一个集合对象中的各个元素，而无需暴露对象的内部细节
 * 
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		MyList myList = new MyList();
		List<Object> list = Arrays.asList(new Object[] { new Object(), new Object(), new Object() });
		myList.setElements(list);
		Iterator iter = myList.createIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
