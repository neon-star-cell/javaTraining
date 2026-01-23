package com.ibm.client.cui;

class Point {
	public int x;
	public int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int distance(Point b) {
		int xdiff = this.x - b.x;
		int ydiff = this.y = b.y;
		return (int)Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}
}

public class MainApp {
	public static void main(String[] args) {
		String s = new String("Avnitt");
		String ss = new String("Avnitt");
		System.out.println(s.equals(ss));
	}
}