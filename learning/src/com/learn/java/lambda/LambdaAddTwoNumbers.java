package com.learn.java.lambda;
import java.util.ArrayList;


public class LambdaAddTwoNumbers {
	 public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
				 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		
		numbers.forEach((n) -> System.out.println(n));
	 }
}