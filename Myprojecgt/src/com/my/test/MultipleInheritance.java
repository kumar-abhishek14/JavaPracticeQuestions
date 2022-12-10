package com.my.test;

public class MultipleInheritance implements Interfacetest,InterfaceTest2 {

	@Override
	public void say() {
		System.out.println("Hi I have implemented multiple inheritance");
		
	}

	@Override
	public void say2() {
		System.out.println("Hi i am method of second parent");
		
	}

}
