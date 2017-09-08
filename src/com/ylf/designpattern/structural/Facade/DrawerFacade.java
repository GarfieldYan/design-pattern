package com.ylf.designpattern.structural.Facade;

public class DrawerFacade {
	
	protected Drawer1 drawer1 = new Drawer1();
	
	protected Drawer2 drawer2 = new Drawer2();
	
	public void getImportantFile() {
		drawer1.open();
		drawer2.open();
	}

}
