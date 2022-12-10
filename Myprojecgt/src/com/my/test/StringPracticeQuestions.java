package com.my.test;

import java.util.Collection;
import java.util.Scanner;

public class StringPracticeQuestions {
	public static void main(String[] args) {
	
	String s2="Rishu";//Rihsu//
	char s='R';
	int check=0;
	int i=0;
	for(i=0;i<s2.length();i++) {
		if(s2.charAt(i)==s) {
			check=1;
			break;
		}
	}
	if(check==1) {
		System.out.println("Element is present at "+i+" index");
	}
	else
	{
		System.out.println("Element is not present ");
	}
	}

}
