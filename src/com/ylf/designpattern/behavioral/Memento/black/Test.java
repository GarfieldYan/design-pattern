package com.ylf.designpattern.behavioral.Memento.black;

import com.ylf.designpattern.behavioral.Memento.white.MementoManager;
import com.ylf.designpattern.behavioral.Memento.white.Originator;

/**
 * 备忘录模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存该状态。这样以后可将对象恢复到原先保存的状态
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("ON");
		MementoManager mementoManager = new MementoManager();
		mementoManager.saveMemento(originator.createMemento());
		originator.setState("OFF");
		originator.setMemento(mementoManager.retrieveMemento());
		System.out.println(originator.getState());
	}

}
