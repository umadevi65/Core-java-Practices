package com.basics;

public class CallingVariable {
	static void m1(int p) {
		int q = 20;
		if (p == 10) {
			int r = q + 20;
			System.out.println("invalues:" + r);
			System.out.println("invalues:" + p);
			System.out.println("invalues:" + q);
		}
	//	System.out.println("values:" + r);
		System.out.println("outvalues:" + p);
		System.out.println("outvalues:" + q);

	}

	public static void main(String[] args) {
		m1(10);
		m1(20);
	}

}
