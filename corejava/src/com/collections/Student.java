package com.collections;

public class Student {
	public int sid;
	public String sname;

	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	

}
