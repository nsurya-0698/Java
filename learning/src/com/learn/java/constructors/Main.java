package com.learn.java.constructors;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Surya");
		
		Student allArgStudent = new Student("teja", "10th", 10);
		
		System.out.println(student.getName());
		System.out.println(allArgStudent.getName());
			
	}
}
