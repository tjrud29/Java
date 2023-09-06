package com.kh.inheritance.animal;

public class Animal {//동물 클래스 정의
	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}		
		
	public String getName() {
		return name;
	}
		
	
	public void info() {
		System.out.println("이름" + name);
	}
	public void eat() {
		System.out.println(name +"동물이 먹이를 먹습니다");
	}
	public void sleep() {
		System.out.println(name + "동물이 잠을 잡니다"); 
	}
	
	public void punch() {
		System.out.println(name + "동물이 주먹을 날립니다");
		
	}
	
	public void jump() {
		System.out.println(name + "동물이 뜁니다");
	}
}
