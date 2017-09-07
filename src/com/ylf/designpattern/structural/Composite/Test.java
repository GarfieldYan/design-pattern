package com.ylf.designpattern.structural.Composite;

/**
 * 组合模式，将对象组合成树状结构，以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性，类似文件和文件夹的关系
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Component c1 = new Composite();
		c1.setName("组合对象1");
		c1.add(new Leaf("单个对象1"));
		c1.add(new Leaf("单个对象2"));
		Component c2 = new Composite();
		c2.setName("组合对象2");
		c2.add(new Leaf("单个对象3"));
		c2.add(new Leaf("单个对象4"));
		c1.add(c2);
		c1.display(0);
	}

}
