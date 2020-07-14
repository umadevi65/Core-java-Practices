package com.exceptions;

interface Vehicle {
}

class Car {
}

class Ford extends Car implements Vehicle {
}

class Suzuki extends Car implements Vehicle {
}

public class ClassCastExceptionSample {
	public static void main(String[] args) {
		Object ford = new Ford();
		Object car = new Car();

		if (ford instanceof Vehicle) {
			System.out.println("True: Ford implements Vehicle");
		}
		if (ford instanceof Car) {
			System.out.println("True: Ford extends Car");
		}
		if (ford instanceof Ford) {
			System.out.println("True: Ford is Ford");
		}
		if (ford instanceof Object) {
			System.out.println("True: Object is the parent type of all objects");
		}
		//
		// false  Perfect Usage of instance Of 
		if (car instanceof Ford) {
			System.out.println("False: Car");
		}
	}
}
	