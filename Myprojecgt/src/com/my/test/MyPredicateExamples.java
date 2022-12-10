package com.my.test;
public class MyPredicateExamples {
 public static void main(String[] args) {
	 String s="Java is an interesting programming langauge";
	 char[] arr= {'A','b','c'};
	 String chararrayobject=new String(arr);
	 StringBuilder s2=new StringBuilder(s);
	 StringBuffer s3=new StringBuffer(s);
	 System.out.print(s.length());
	 System.out.println(s.charAt(12));
	 System.out.println(s.indexOf('i'));
	// String s2=s.substring(5,9);
	 System.out.println(s2);
	 //String[] s3=s.split("an");
	 //for(int i=0;i<s3.length;i++) {
	 //System.out.println(s3[i]);
	 //}
	 System.out.println(s2.reverse());
	 System.out.println(s.contains("is"));
	 System.out.println(s.contentEquals(s3));
	 System.out.println(chararrayobject);
	 
	 
	 
 }
}
