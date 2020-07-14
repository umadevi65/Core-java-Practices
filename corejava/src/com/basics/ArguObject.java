package com.basics;

public class ArguObject {
	int x;
	int y;

	void m1(ArguObject a) {
		x = x + 1;
		y = y + 2;

		a.x = a.x + 3;
		a.y = a.y + 4;
	}

	public static void main(String[] args) {
		ArguObject a1 = new ArguObject();
		ArguObject a2 = new ArguObject();

		a1.m1(a2);
		System.out.println("values:" + "x=" + a1.x + ",y=" + a1.y);
		System.out.println("values:" + "x=" + a2.x + ",y=" + a2.y);
		System.out.println(".......................................");
		a2.m1(a1);
		System.out.println("values:" + "x=" + a1.x + ",y=" + a1.y);
		System.out.println("values:" + "x=" + a2.x + ",y=" + a2.y);
		System.out.println(".......................................");
		a1.m1(a2);
		System.out.println("values:" + "x=" + a1.x + ",y=" + a1.y);
		System.out.println("values:" + "x=" + a2.x + ",y=" + a2.y);
		System.out.println(".......................................");
		a2.m1(a1);
		System.out.println("values:" + "x=" + a1.x + ",y=" + a1.y);
		System.out.println("values:" + "x=" + a2.x + ",y=" + a2.y);
		System.out.println(".......................................");

	}
}
