package com.ylf.designpattern.behavioral.Memento.white;

/**
 * 备忘录管理者，负责保存备忘录，但不能修改和查看备忘录里的内容
 * @author Jerry
 *
 */
public class MementoManager {
	
	private Memento memento;
	
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	public Memento retrieveMemento() {
		return memento;
	}
	
}
