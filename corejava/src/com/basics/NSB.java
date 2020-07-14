package com.basics;

public class NSB {
	{
		System.out.println("NSB Block");
	}
	NSB(){
		System.out.println("Single org");
	}
	NSB(int a){
	System.out.println("2 arg");	
	}
	public static void main(String[] args) {
		NSB o1 = new NSB();
		NSB o2 = new NSB(10);

	}
}
