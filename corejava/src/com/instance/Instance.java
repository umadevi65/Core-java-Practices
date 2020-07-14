package com.instance;
class Example{
	void m1() {
		System.out.println("m1");
	}
}
class Sample extends Example{
	void m2() {
		System.out.println("m2");
	}
}
public class Instance {
static void m3(Example e) {
	e.m1();
}
public static void main(String[] args) {
}
}
