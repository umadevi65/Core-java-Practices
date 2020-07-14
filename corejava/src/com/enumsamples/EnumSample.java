package com.enumsamples;

public class EnumSample {
	public static void main(String[] args) {
		Sample[] sampleArray = Sample.values();
		System.out.println("********************");
		System.out.println("My M:");
		System.out.println("*********************");
		for (Sample sample : sampleArray) {
			System.out.println(" names: " + sample.name() + "      Relation:" + sample.getRelation());
		}
	}
}
