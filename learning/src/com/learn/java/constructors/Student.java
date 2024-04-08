package com.learn.java.constructors;

public class Student {
	private String name;
	private String className;
	private int marks;
	
	//no arg constructor
	public Student() {
	
	}
	
	//all arg constructor
	public Student(String name, String className, int marks) {
		this.name = name;
		this.className = className;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}