package com.ibm.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Point<T> {
	private T x;
	private T y;

	public Point(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return this.x;
	}
	
	public T getY() {
		return this.y;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	
	public void setY(T y) {
		this.y = y;
	}
}

public class Application { 
	
//	public Collection<String> getData() {
//		Collection<String> result = new HashSet<>();
//		
//		result.add("A");
//		result.add("B");
//		result.add("C");
//		result.add("D");
//		result.add("C");
//		return result;
//	}
	
	public Map<Integer, String> getData() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "l");
		map.put(4, "d");
		map.put(5, "a");
		map.put(6, "h");
		
		return map;
	}
	public static void main(String[] args) {
//		Point<Float> point1 = new Point<>(2.0f, 2.3f);
//		System.out.println(point1.getX() + ", " + point1.getY());
//		
//		Point<Integer> point2 = new Point<>(1, 4);
//		System.out.println(point2.getX() + ", " + point2.getY());
		
//		ArrayList<String> arrayList = new ArrayList<String>();
		Application application = new Application();
		Map<Integer, String> data = application.getData();
		
		Set<Entry<Integer, String>> entrySet = data.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+ " --> " + entry.getValue());
		}
	}
}