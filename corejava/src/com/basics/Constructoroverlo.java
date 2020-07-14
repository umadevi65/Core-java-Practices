package com.basics;

public class Constructoroverlo {
	int x = m1();
	{
		System.out.println("NSB Block");
	}

	int m1() {
		System.out.println("m1 method");
		return 10;
	}

	public Constructoroverlo() {
		this(10);
		x=50;
		System.out.println(" no arg");

	}

	public Constructoroverlo(int a) {
		this("devi");
		x=60;
		System.out.println(" integer arg");

	}

	public Constructoroverlo(String b) {
		x=70;
		System.out.println(" string arg");

	}

	public static void main(String[] args) {

		Constructoroverlo c1 = new Constructoroverlo();
		System.out.println("c1 values:"+c1.x);
		Constructoroverlo c2 = new Constructoroverlo(10);
		System.out.println("c2 values:"+c2.x);
		
		Constructoroverlo c3 = new Constructoroverlo("Uma");
		System.out.println("c3 values:"+c3.x);
		

	}

}
