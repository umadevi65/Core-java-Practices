package com.basics;

public class InterfaceApp {
	int a;

	public InterfaceApp(int a) {
		System.out.println("a="+a);
		
		System.out.println("a="+this.a);
		this.a=a;
		System.out.println("a="+a);
		 
		

	}

	public static void main(String[] args) {
		
		InterfaceApp ip = new InterfaceApp(20);
		System.out.println("a="+ip.a);
	}
}
