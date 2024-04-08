package com.learn.java.listsAndMaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
	
	public static void main(String[] argas) {
		
//		Dynamic array
//		Bad memory utilization
//		Faster access
//		best for storing/accessing data
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("Mastang");
		cars.add("Hunday");		
		
		System.out.println(cars.get(0));
		
		cars.set(0, "Tayota");
		
		System.out.println(cars.get(0));
		
		cars.remove(0);
		
		System.out.println(cars.get(0));
		
		for (String i : cars) {
			System.out.println(i);
		}
		
//		Slower add/remove
//		Good memory untilization
//		Slower access
//		best for manipulating data
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Banana");
		fruits.add("pinaple");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		fruits.remove(0);
		
		System.out.println(fruits);

	}
}