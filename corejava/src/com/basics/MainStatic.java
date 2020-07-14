package com.basics;

public class MainStatic {
	static int b = m2();

	static int m2() {
		System.out.println("b=" + b);
		return 10;
	}

	static {
		System.out.println("static block 1111111111111");
		MainStatic ms= new MainStatic();
		String [] s = new String[0];
		MainStatic.main(s);
		main(new String[0]);
		main(s);
	}
	static int a = m1();

	static int m1() {
		System.out.println("a=" + a);
		return 10;
	}

	static {
		System.out.println("sttaic 222222222");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}
