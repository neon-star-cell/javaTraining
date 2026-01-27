package com.ibm.collections;

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
	public static void main(String[] args) {
		Point<Float> point1 = new Point<>(2.0f, 2.3f);
		System.out.println(point1.getX() + ", " + point1.getY());
		
		Point<Integer> point2 = new Point<>(1, 4);
		System.out.println(point2.getX() + ", " + point2.getY());
	}
}