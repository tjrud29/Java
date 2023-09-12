package com.kh.abstractSample.Animal;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("¾ß¿Ë");
	}
}