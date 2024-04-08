package com.learn.java.abstraction;


abstract class Sound {
	// Abstract method (does not have a body)
	public abstract void animalCommand();

	public void animalSound() {
		System.err.println("Animal is making pew pew!!");
	}
}

class Pig extends Sound {
	public void animalCommand() {
		System.out.println("Sleep");
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		
		myPig.animalCommand();
	}
}