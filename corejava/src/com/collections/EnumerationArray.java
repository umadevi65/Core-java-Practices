package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationArray {
public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<>();
	alist.add("Srinu");
	alist.add("Uma");
	alist.add("UA");
	alist.add("Bannu");
	
	Enumeration<String> enu= Collections.enumeration(alist);
	while(enu.hasMoreElements()) {
		String data=enu.nextElement();
		System.out.println(data);
	}
	
}
}
