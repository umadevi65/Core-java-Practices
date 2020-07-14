package com.object;
class Sample{
	@Override
	public boolean equals(Object obj) {
		
		
		return super.equals(obj);
	}
}

public class Equalsssss {
	static int x = 10;
	static int y = 20;
	static int z = 30;

	Equalsssss equals1;
	Equalsssss equals2;

	public static void main(String[] args) {
		Equalsssss equals1 = new Equalsssss();
		Equalsssss equals2 = new Equalsssss();
		Sample SObject=new Sample();
		Equalsssss equals3= equals2;
		System.out.println("using '==' operator");
		System.out.println(x == y);
		System.out.println(z== y);
		
		System.out.println("************");
		System.out.println(equals1==equals2);
		System.out.println(equals2==equals2);
		
		System.out.println("*********");
		System.out.println("using equals method");
		
		System.out.println();
		System.out.println(equals1.equals(equals2));
		System.out.println(equals1.equals(SObject));

	}
	

}
