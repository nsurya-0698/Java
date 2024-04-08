package com.learn.java.listsAndMaps;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Bannana");
		fruits.add("Apple");
		fruits.add("raseberry");
		
		for(String i : fruits) {
			System.out.println(i);
		}
		
		Iterator<String> it = fruits.iterator();
		
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}