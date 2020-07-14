package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationVector {
public static void main(String[] args) {
	Vector<String > v= new Vector<>();
	v.add("bannu");
	v.add("UA");
	v.add("Uma");
	v.add("srinu");
	Enumeration<String> enu=v.elements();
	while (enu.hasMoreElements()) {
		String string = (String) enu.nextElement();
		System.out.println("Details:"+string);
	}
}
}
