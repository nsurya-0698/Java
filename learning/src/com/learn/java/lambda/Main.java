package com.learn.java.lambda;

public class Main {
	
	public static void main(String[] args) {
		addingTwoNumbers addition = new addingTwoNumbers();
		
		int result = addition.addTwoNumbers(2, 5);
		
		System.out.println(result);
	}
}
