package com.oops;

class A {
	A(){
		System.out.println("A constructor"+this);
	}
/*	static int a = m1();

	public static int m1() {
		System.out.println("A m1");
		return 10;
	}

	static {
		System.out.println("A static block");
	}

	public static void main(String[] args) {
		System.out.println("A block");
	}
*/}

class B extends A{
	B(){
		System.out.println("B Constructor"+this);
		
	}
/*	static int b = m2();

	public static int m2() {
		System.out.println("B m2");
		return 10;
	}

	static {
		System.out.println("B static block");
	}

	public static void main(String[] args) {
		System.out.println("B block");
		System.out.println("Avalue"+a);
		System.out.println("B value"+b);
	}
*/}
class TestInheritance{
	public static void main(String[] args) {
		TestInheritance b=new TestInheritance();
		System.out.println("main method"+b);
	}
}
