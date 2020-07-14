package com.basics;

public class ReturnSample {
	static int m1(int a) {
		System.out.println("before");
		if(a==0) {
			System.out.println("values:"+a);
			return 10;
		}
		
		System.out.println();
		return a;
	}

	public static void main(String[] args) {

	}

}
