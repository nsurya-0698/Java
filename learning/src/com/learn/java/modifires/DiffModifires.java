package com.learn.java.modifires;

abstract class Student {
	public abstract void study();	
}

public class DiffModifires {
	
	final int x = 10;
	
	static void myStaticMethod() {
		System.out.println("My static method");
	}
	
	public void study() {
		System.out.println("Abstract Class");
	}

}

class Teacher extends Student {
	public void study() {
		System.out.println("abstract class");
	}
}