package com.exceptions;

public class SampleFinaly {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch (Exception e) {

	System.out.println("not possible");
	}

	finally {
		System.out.println("sample program");
	}
}
}
