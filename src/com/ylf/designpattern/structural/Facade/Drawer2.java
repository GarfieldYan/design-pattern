package com.ylf.designpattern.structural.Facade;

public class Drawer2 {
	
	public void open() {
		System.out.println("第二个抽屉被打开");
		getFile();
	}
	
	public void getFile() {
		System.out.println("得到重要文件！");
	}

}
