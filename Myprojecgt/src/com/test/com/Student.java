package com.test.com;

public class Student {
   private int id;
   private String name;
   public int getId() {
	return id;
} 
   //paremeterized constructor
   public Student(int id,String name) {
	   this.id=id;
	   this.name=name;
   }
   //Copy Constructor
   public Student(Student s) {
	   this.id=s.id;
	   this.name=s.name;
   }
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
