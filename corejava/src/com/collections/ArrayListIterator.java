package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Srinu");
		alist.add("ua");
		alist.add("Bannu");
		Iterator<String> itr=alist.iterator();
		while(itr.hasNext()) {
			String data=itr.next();
			System.out.println("Data:"+data);
		}
	}
}
