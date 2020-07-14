package com.basics;

public class Encap {
	public static void main(String[] args) {
		User value=new User();
		value.setName("Bannu");
		value.getName();
		System.out.println(value);
	}
}

class User {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}
}
