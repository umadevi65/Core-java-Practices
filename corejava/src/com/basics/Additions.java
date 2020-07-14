package com.basics;

import java.util.Scanner;

public class Additions {
	static void calculations(int a,int b) {
		System.out.println("Addition="+(a+b));
		System.out.println("subtraction="+(a-b));
		System.out.println("Multiplication="+a*b);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter first value:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter Second value:");
		Scanner sc1=new Scanner(System.in);
		int b= sc1.nextInt();
		calculations(a,b);
	}
}
