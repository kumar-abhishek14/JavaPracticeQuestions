package com.rishu;
import java.util.Scanner;
class TestThrow{
	void printDetails(int n) throws ArithmeticException {
		if(n>0) {
			System.out.println(n);
		}
		else {
			throw new ArithmeticException("Number is less than 0");
		}
	}
}
public class MyJavaPractice {
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		n=sc.nextInt();
		TestThrow t=new TestThrow();
		t.printDetails(n);
		
		System.out.println("Rest of code");

}
}
