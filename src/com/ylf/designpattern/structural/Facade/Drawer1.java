package com.ylf.designpattern.structural.Facade;

public class Drawer1 {

	public void open() {
		System.out.println("第一个抽屉被打开");
		getKey();
	}
	
	public void getKey() {
		System.out.println("得到第二个抽屉的钥匙");
	}
	
}
