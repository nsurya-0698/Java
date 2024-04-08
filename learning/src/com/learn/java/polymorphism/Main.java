package com.learn.java.polymorphism;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("I am pig");
	}
}

class Donkey extends Animal {
	public void animalSound() {
		System.out.println("I am chsabv akjsvc");
	}
}

class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDonkey = new Donkey();
		Animal myPig = new Pig();

		myAnimal.animalSound();
		myDonkey.animalSound();
		myPig.animalSound();

	}
}