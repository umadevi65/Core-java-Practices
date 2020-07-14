package com.object;

class Sample1 {
	static void getClassName(Object obj) {
	String name=	obj.getClass().getName();
	System.out.println("name is:"+name);
	}
}

public class GetcClassssss {

	
	public static void main(String[] args) {
		GetcClassssss object = new GetcClassssss();
		Sample1 samObject = new Sample1();
		samObject.getClassName(object);
		
		
		System.out.println();
	
	}
}
