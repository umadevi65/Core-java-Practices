package com.oops;

class Example {
	static int a = m1();
	static {
		System.out.println(" Example SB");

	}
	{
		System.out.println("Example NSB");
	}
	

	public Example() {
		System.out.println("Example constructor");
	}

	static int m1() {
		System.out.println("Example sv is created ");
		return 10;

	}

	int x=m2();
	{
		System.out.println("Example NSV");

	}

	int m2() {

		System.out.println("Example NSV is craeted");
		return 20;
	}

	void abc() {
		System.out.println("Example abc");
	}

	void bbc() {
		System.out.println("Example bbc");
	}

}

public class Sample_InheritanceSV_NSV extends Example {
	static int b = m3();
	static {
		System.out.println(" Sample_InheritanceSV_NSV NSB");

	}
	{
		System.out.println("Sample_InheritanceSV_NSV SB");
	}
	static {
		System.out.println(" Sample_InheritanceSV_NSV NSB");
	}

	public Sample_InheritanceSV_NSV() {
		System.out.println("Sample_InheritanceSV_NSV constructor");
	}

	static int m3() {
		System.out.println("Sample_InheritanceSV_NSV  sv is created ");
		return 30;

	}

	int m4() {

		System.out.println("Sample_InheritanceSV_NSV NSV is craeted");
		return 40;
	}

	void abc() {
		System.out.println("Sample_InheritanceSV_NSV abc");
	}

	
	public static void main(String[] args) {
		Sample_InheritanceSV_NSV s = new Sample_InheritanceSV_NSV();
		s.abc();
		s.bbc();
	}
}
