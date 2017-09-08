package com.ylf.designpattern.structural.Facade;

/**
 * 门面模式，为子系统中的一组复杂接口提供一个简单的访问方式
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		DrawerFacade drawer = new DrawerFacade();
		drawer.getImportantFile();
	}

}
