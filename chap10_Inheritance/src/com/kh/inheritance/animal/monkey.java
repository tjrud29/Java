package com.kh.inheritance.animal;

public class monkey extends Animal{
	public monkey(String name) {
		super(name);
		
	}

	@Override
	public void punch() {
		System.out.println(getName() +"³¯¸°´Ù");
}
}