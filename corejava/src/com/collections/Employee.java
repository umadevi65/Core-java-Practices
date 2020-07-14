package com.collections;

public class Employee {
	public int eid;
	public String ename;

	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
}
