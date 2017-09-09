package com.ylf.designpattern.behavioral.Mediator;

public class ConcreteMediator implements Mediator {
	
	private Colleague colleague1;
	private Colleague colleague2;
	
	public ConcreteMediator() {
		super();
		this.colleague1 = new ConcreteColleague1(this);
		this.colleague2 = new ConcreteColleague2(this);
	}
	
	public Colleague getColleague1() {
		return colleague1;
	}
	
	public Colleague getColleague2() {
		return colleague2;
	}

	@Override
	public void cooperate(Colleague colleague) {
		if (colleague == colleague1) {
			colleague2.action();	//colleague1发生改变，其它同事做出响应
		} else if (colleague == colleague2) { 
			colleague1.action();	//colleague2发生改变，其它同事做出响应
		}
	}

}
