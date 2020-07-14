package com.oops;

public class StudentEncapsulation {
	private int marks;
	private String grade;

	public void setMarks(int marks) {
		if(marks<10) {
			System.out.println("Student failed");
		}
		else {
			this.marks = marks;
System.out.println("Student Passed");
		}
		}

	public int getMarks() {
		return marks;
	}

}

class Grading {
	public static void main(String[] args) {
		StudentEncapsulation sts = new StudentEncapsulation();
		sts.setMarks(10);
		System.out.println("Marks of a Student" + sts.getMarks());
	}

}