package com.learn.java.inheritance;

public class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tuut, tuut");
	}
}
class Car extends Vehicle {
	public String modelName = "Mustng";
}