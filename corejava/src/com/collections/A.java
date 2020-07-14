package com.collections;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Uma");
		aList.add("Bannu");
		aList.add("Confusion");
		System.out.println("Names:" + aList);
		aList.remove("Confusion");
		aList.add("happpy");
		aList.add(3,"UA");
		System.out.println("Names:" + aList);
		System.out.println(aList.get(1));
		
	}

}
