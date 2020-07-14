package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorSample {
public static void main(String[] args) {
	/*ArrayList<String> object=new ArrayList<>();
	System.out.println("Enter the names: ");
	object.add("Bannu");
	object.add("ua");
	
	System.out.println("names:"+object);
	*/ArrayList<Integer> values=new ArrayList<>();
	values.add(1);
	values.add(2);
	values.add(3);
	Iterator<Integer> itr= values.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
