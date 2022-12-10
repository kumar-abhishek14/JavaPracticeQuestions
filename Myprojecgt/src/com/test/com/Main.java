package com.test.com;

public class Main {

	public static void main(String[] args) {
		Student s=new Student(1,"Rishu");
		Student s2=new Student(s);
		System.out.println("First object value "+s.getId()+" "+s.getName());
		System.out.println("second object value "+s2.getId()+" "+s2.getName());
		
		

	}

}
