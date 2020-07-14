package com.exceptions;

class Parent {
	public Parent() {
		System.out.println("An instance of the Parent class was created!");
	}
}

final class Child extends Parent {
	public Child() {
		super();
		System.out.println("An instance of the Child class was created!");
	}
}

public class InstanceOfClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child ch = new Child();
		//			ch = (Child)p; // This statement is not allowed.

		if (ch instanceof Parent) {
			ch = (Child)p; // This statement is not allowed.

		}
	}
}