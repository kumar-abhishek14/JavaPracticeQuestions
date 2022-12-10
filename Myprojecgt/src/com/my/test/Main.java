package com.my.test;
class Student{
	public int a;
	public int b;
}
public class Main {

	public static void main(String[] args) {
		ThrowMethodPractice t=new ThrowMethodPractice();
		try {
		t.divide(12, 0);}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hi there");
}
}

