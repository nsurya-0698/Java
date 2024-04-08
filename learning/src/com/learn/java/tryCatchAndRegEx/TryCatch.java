package com.learn.java.tryCatchAndRegEx;
import java.util.HashSet;

public class TryCatch {
	
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		int[] integers = {1, 2, 3, 4};
		
		numbers.add(1);
		numbers.add(20);
		numbers.add(100);
		
		System.out.println(numbers.remove(122));
		
		try {
			System.out.println(integers[121]);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
				throw new ArithmeticException("testing ArithmeticException");
		}
	}
}