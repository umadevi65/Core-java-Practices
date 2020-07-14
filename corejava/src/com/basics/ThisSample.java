package com.basics;

public class ThisSample {
	int x = 10;
	int y = 20;
	ThisSample(){
		System.out.println("constructor");
		return;
	}

	void m1() {
		int x = 20;
		System.out.println("x=" + x);
		System.out.println("this x=" + this.x);
	}

	public static void main(String[] args) {
		ThisSample t= new ThisSample();
		t.m1();
	}
}
