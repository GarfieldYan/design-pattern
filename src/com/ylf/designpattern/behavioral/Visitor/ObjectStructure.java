package com.ylf.designpattern.behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构
 * @author Jerry
 *
 */
public class ObjectStructure {
	
	private List<Element> elements = new ArrayList<Element>();
	
	public void add(Element e) {
		elements.add(e);
	}
	
	public void action(Visitor visitor) {
		for (Element element : elements) {
			//调用元素的accept方法，通过访问者的方式访问元素
			element.accept(visitor);
		}
	}

}
