package com.kh.inheritance.animal;

public class rabbit extends Animal{
	public rabbit(String name) {
		super(name);
		
	}

	@Override
	public void jump() {
		System.out.println(getName() +"¶Ú´Ù");
}
}