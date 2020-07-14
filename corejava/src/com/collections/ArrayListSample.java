package com.collections;

import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList arrayObject = new ArrayList();
		Employee e = new Employee(1, "Bannu");
		Student s = new Student(1, "UA");
		Integer i = new Integer(10);

		arrayObject.add(e);
		arrayObject.add(s);
		arrayObject.add(i);

		System.out.println("arrayObject values:" + arrayObject);
		
		//Without Using Generics
  
		for (Object object : arrayObject) {
			if (object instanceof Employee) {
				Employee emp = (Employee) object;
				System.out.println("Employee details:" + "Eid:" + emp.eid + "   Ename:" + emp.ename);
			}
			if(object instanceof Student) {
				Student stu=(Student)object;
				System.out.println("Student Detals:"+"Sid:"+ stu.sid+" Sname"+stu.sname);
			}
			if(object instanceof Integer) {
				System.out.println("Integer class details:"+object);
			}
		}
		
		//With Generics
		ArrayList<Employee> object=new ArrayList<>();
		object.add(e);
		for (Employee employee : object) {
			System.out.println("Employee:"+employee.eid);
		}
		
		
	}
}
