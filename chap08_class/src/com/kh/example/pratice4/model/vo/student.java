package com.kh.example.pratice4.model.vo;

public class student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public student() {
		this.grade = 1;
		this.classroom =2;
		this.name = "¹Ú¼ºÃ¶";
		this.height = 180.5;
		this.gender = '³²';
	}
	
	public void information() {
		System.out.println("grade :" + grade);
		System.out.println("classroom :" + classroom);
		System.out.println("name :" + name);
		System.out.println("height :" + height);
		System.out.println("gender :" + gender);
		
		
		
		
	}
	
	
	
	
	
}
