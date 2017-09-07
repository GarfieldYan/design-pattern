package com.ylf.designpattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象
 * 
 * @author Jerry
 *
 */
public class Composite extends Component {

	private List<Component> list;

	public Composite() {
		super();
		list = new ArrayList<Component>();
	}

	public Composite(String name) {
		super(name);
		list = new ArrayList<Component>();
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(new String(sb) + this.getName());
		for (Component c : list) {
			c.display(depth + 2);
		}
	}

}
