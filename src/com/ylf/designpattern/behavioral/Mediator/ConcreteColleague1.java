package com.ylf.designpattern.behavioral.Mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("Colleague1 action");
	}

}
