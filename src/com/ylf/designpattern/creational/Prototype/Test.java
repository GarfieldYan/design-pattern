package com.ylf.designpattern.creational.Prototype;

/**
 * 原型模式通过复制一个已经存在的实例来返回新的实例,而不是新建实例.被复制的实例就是我们所称的原型,这个原型是可定制的
 * 原型模式多用于创建复杂的或者耗时的实例, 因为这种情况下,复制一个已经存在的实例可以使程序运行更高效,或者创建值相等,只是命名不一样的同类数据.
 * @author Jerry
 *
 */
public class Test {

	public static void main(String[] args) {
		ConcretePrototype1 cp1 = new ConcretePrototype1();
		Object obj1 = new Object();
		cp1.setObj(obj1);
		cp1.setAge(1);
		//创建2个cp1原型实例的浅拷贝副本
		ConcretePrototype1 copyOfCp1a = (ConcretePrototype1) cp1.Clone();
		ConcretePrototype1 copyOfCp1b = (ConcretePrototype1) cp1.Clone();
		System.out.println(copyOfCp1a.getAge() == copyOfCp1b.getAge());	//true, 值类型的属性复制值
		System.out.println(copyOfCp1a.getObj() == copyOfCp1b.getObj());	//true, 引用类型的属性只复制引用，不复制对象
		
		ConcretePrototype2 cp2 = new ConcretePrototype2();
		SerializableObject obj2 = new SerializableObject();
		cp2.setObj(obj2);
		try {
			ConcretePrototype2 copyOfCp2a = (ConcretePrototype2) cp2.Clone();
			ConcretePrototype2 copyOfCp2b = (ConcretePrototype2) cp2.Clone();
			System.out.println(copyOfCp2a.getAge() == copyOfCp2b.getAge());	//true, 值类型的属性复制值
			System.out.println(copyOfCp2a.getObj() == copyOfCp2b.getObj());	//false, 引用类型的属性也复制对象
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
