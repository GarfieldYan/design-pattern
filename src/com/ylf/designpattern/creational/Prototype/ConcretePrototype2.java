package com.ylf.designpattern.creational.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深拷贝模式子类
 * 深拷贝: 对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制.
 * @author Jerry
 *
 */
public class ConcretePrototype2 implements Prototype, Serializable {
	
	private static final long serialVersionUID = -1544502068119193346L;

	// 引用类型只复制引用，不复制对象
	private SerializableObject obj;
	// 值类型进行值的复制
	private int age;

	public Object getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Object Clone() {
		Object copyOfCp2 = null;
		try {
			ByteArrayOutputStream out1 = new ByteArrayOutputStream();
			ObjectOutputStream out2 = new ObjectOutputStream(out1);
			out2.writeObject(this);
			ByteArrayInputStream in1 = new ByteArrayInputStream(out1.toByteArray());
			ObjectInputStream in2 = new ObjectInputStream(in1);
			copyOfCp2 = in2.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return copyOfCp2;
	}

}
