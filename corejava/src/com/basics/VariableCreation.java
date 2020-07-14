package com.basics;

public class VariableCreation {
	final static int c=10;
	static int d=20;
	int e=200;
	int  g=300;
	public static void main(String[] args) {
		/*int a = 10;
		System.out.println("a before=" + a);
		a = 20;
		System.out.println("a after="+a);
		Variable v= new Variable();
		System.out.println("referenced variable="+v);
		v=new Variable();
		System.out.println("referenced variaable ="+v);*/
		
		final int a=10;
	//	a=20;
		int b=20;
		System.out.println("values are:"+a);
		System.out.println("values are:"+b);
		System.out.println("values are:"+c);
		System.out.println("values are:"+d);
		VariableCreation vc=new VariableCreation();
		
		System.out.println("values are:"+vc.e);
		System.out.println("values are:"+vc.g);
		//System.out.println("values are:"+a);
		
		
		
	}
}
