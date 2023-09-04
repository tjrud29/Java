package com.kh.example.pratice3.vo;

public class Circle {
	//
	double Pl;
	int radius;
	
	Circle(double Pl, int radius) {
		this.Pl = Pl;
		this.radius = radius;
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		double area = radius * radius * Pl;
	}
	
	public void getSizeOfCircle() {
		double size =2 * radius * Pl;
	}
	
	
}
