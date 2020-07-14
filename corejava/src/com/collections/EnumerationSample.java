package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationSample {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("uma");
		v.add("UA");
		v.add("Bannu");
		System.out.println("values:" + v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			// Object object = (Object) e.nextElement();
			System.out.println(e.nextElement());
		}
	}

}
