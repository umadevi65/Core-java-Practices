package com.basics;

class A {
	 int x=m1();
	static public int m1() {
		 int x=30;
		System.out.println("A m1");
		return 10;
	}

	/*
	 * public void m1(char c) { System.out.println("A m1 Char"); }
	 */
}

class B extends A {
	int y=m1();
	static public int m1() {
		 int y=40;
		System.out.println("B m1");
		return 20;
	}

	/*
	 * public void m1(char c) { System.out.println("B m1 Char"); }
	 * 
	 * public void m1(long l) { System.out.println("B m1 long"); }
	 */

}

public class Overload {
	public static void main(String[] args) {
		B b = new B();
	System.out.println("x="+b.x);
	System.out.println("y="+b.y);
	}

}
