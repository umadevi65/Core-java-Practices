package com.basics;

public class PhoneTest {
	public static void main(String[] args) {
		PhoneTest pt = new PhoneTest();
		Nokia n = new Nokia();
		pt.phone(n);
		//pt.phone(new MI());
	}

	public void phone(Phone p) {
		p.dail();
		p.display();
	}
}
