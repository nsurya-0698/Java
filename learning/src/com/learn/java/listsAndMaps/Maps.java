package com.learn.java.listsAndMaps;
import java.util.HashMap;
import java.util.HashSet;

public class Maps {

	public static void main(String[] args) {
		
//		Implements the map interface
//		Key to vlaue
//		No duplicates keys
//		Allows Null values and null keys
//		Not thread_safe/synchronized
//		Fater
//		Complexity: O(1)
		HashMap<String, String> UnitedStates = new HashMap<String, String>();
		
		UnitedStates.put("California", "Sacramento");
		UnitedStates.put("Colorado", "Denver");
		UnitedStates.put("Texas", "Austin");
		UnitedStates.put("NY", "Albany");
		UnitedStates.put("Missouri", "Jefferson city");
		
		System.out.println(UnitedStates.size());
		
		for (String i : UnitedStates.values()) {
			System.out.println(i);
		}
		
//		Implements set interface
//		Unique elements
//		no specific order
//		allows null values
//		Not thread_safe/synchronized
//		Stores data as objects
//		Slower compared to hashMaps
//		Complexity: O(n)
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("California");
		cities.add("NYC");
		cities.add("Overland park");
		cities.add("Kansas city");
		
//		remove, size, get, put/add, containers()
		System.out.println(cities);
	}
}