package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.eat();
		myDog.speak();
		
		cat mycat = new cat("绊具固");
		mycat.sleep();
		
		monkey mymonkey = new monkey("盔件捞");
		mymonkey.punch();
		
		rabbit myrabbit = new rabbit("配尝");
		myrabbit.jump();
	}

}
