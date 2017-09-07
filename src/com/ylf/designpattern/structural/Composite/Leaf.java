package com.ylf.designpattern.structural.Composite;

/**
 * 单个对象
 * @author Jerry
 *
 */
public class Leaf extends Component {
	
	public Leaf() {
		super();
	}

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		//Leaf没有add操作，所以不做任何事情
	}

	@Override
	public void remove(Component component) {
		//Leaf没有remove操作，所以不做任何事情
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(new String(sb) + this.getName());
	}

}
