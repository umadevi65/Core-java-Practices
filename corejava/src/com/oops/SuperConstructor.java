package com.oops;

class Super {
	public Super() {
		System.out.println("Super object"+this);
	}
}

public class SuperConstructor extends Super { s
	public SuperConstructor() {
	System.out.println("Sub object"+this);	
	}
	public static void main(String[] args) {
		System.out.println("main");
		SuperConstructor s = new SuperConstructor();

	}

}
