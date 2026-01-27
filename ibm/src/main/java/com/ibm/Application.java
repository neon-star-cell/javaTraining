package com.ibm;

class Point {
	int x;
	int y;
	static int totalPoints;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		totalPoints++;
	}
	
	static {
		System.out.println("Static initializer called.");
		totalPoints = 0;
	}

	public float distFromPoint(Point y) {
		int xdiff = this.x - y.x;
		int ydiff = this.y - y.y;
		return (float)Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}

	public float distFromOrigin() {
		return this.distFromPoint(new Point(0, 0));
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public boolean equals(Object target) {
		// TODO Auto-generated method stub
		if(target != null && target instanceof Point) {
			Point point2 = (Point)target;
			return this.x == point2.x && this.y == point2.y;
		}
		return false;
	}
}

public class Application { 
	public static void main(String[] args) {
		Point[][] points;
		points = new Point[3][2];

		points[0][0] = new Point(0, 5);
		points[1][0] = new Point(1, 7);
		points[2][1] = new Point(3, 5);
		
		System.out.println(points[0][0].equals(points[1][0]));

		System.out.printf("%.2f\n", points[0][0].distFromOrigin());
		System.out.printf("%.2f", points[0][0].distFromPoint(points[1][0]));
	}
}