package com.basics;

public class NonVariables {
	int x=10;
	int y=20;
	public static void main(String[] args) {
		NonVariables n1=new NonVariables();
		NonVariables n2=new NonVariables();
		NonVariables n3=n2;
		System.out.println("before");
		System.out.println("values are :"+n1.x+"y="+n1.y);
		System.out.println("values are :"+n2.x+"y="+n2.y);
		System.out.println("values are :"+n3.x+"y="+n3.y);
		
		n2.x=30;
		n2.y=40;
		System.out.println("after");
		System.out.println("values are :"+n2.x+"y="+n2.y);
		System.out.println("values are :"+n3.x+"y="+n3.y);
		
		
	}

}
