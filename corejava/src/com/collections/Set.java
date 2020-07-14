package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();

		System.out.println("Initial Capacity=" + hashSet.size());
		System.out.println("Initial Capacity=" + linkedSet.size());
		System.out.println("Initial Capacity=" + treeSet.size());
		System.out.println("**********************************************");
		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add("Bannu"));
		
		System.out.println("size="+hashSet.size());
		System.out.println("Data="+hashSet);
		System.out.println("***********Linked**********");
		System.out.println(linkedSet.add(null));
		System.out.println(linkedSet.add(null));
		System.out.println(linkedSet.add(null));
		System.out.println(linkedSet.add("Bannu"));
		
		System.out.println("size="+linkedSet.size());
		System.out.println("Data="+linkedSet);
		
		
	}
}
