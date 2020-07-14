
package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListOperator {
	public static void main(String[] args) {
		ArrayList arlist = new ArrayList();
		arlist.add("a");
		arlist.add(3);
		arlist.add("b");
		arlist.add(4);
		arlist.add("z");
		arlist.add(0);
		for (Object object : arlist) {
			
		}
		int count = 1;

		ListIterator itr = arlist.listIterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj instanceof ArrayList) {
				String s = (String) obj;
				itr.set(s.toUpperCase());
				// System.out.println("Data:"+data);
			} else if(obj instanceof Integer){
				if (count == 1) {
					itr.add(20);
					count++;
				}
			}
			
		}
		System.out.println("all elements after iteration:"+arlist);
		while(itr.hasPrevious()) {
			Object data=itr.previous();
			System.out.println(data+"=data");
		}
	}
}
