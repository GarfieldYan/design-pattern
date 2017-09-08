package com.ylf.designpattern.structural.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	private HashMap<String, Flyweight> flyweightPool = new HashMap<String, Flyweight>();
	
	public Flyweight getConcreteFlyweight(String key) {
		if (flyweightPool.containsKey(key)) {
			return flyweightPool.get(key);
		} else {
			Flyweight newFlyweight = new ConcreteFlyweight(key);
			flyweightPool.put(key, newFlyweight);
			return newFlyweight;
		}
	}
	
}
