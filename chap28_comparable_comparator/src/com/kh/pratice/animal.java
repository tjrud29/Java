package com.kh.pratice;

public class animal implements Comparable<animal>{
	private String name;
	private int age;
	
	public animal(String name, int age) {
		this.name = name;
		this.age = age;
		
		
		}

	@Override
	public int compareTo(animal otherAnimal) {
		// TODO Auto-generated method stub
		return this.age - otherAnimal.age;
		
	}
	
	@Override
	public String toString() {
		return "animal{name=" + name + ",age " + age;
	}
 }
