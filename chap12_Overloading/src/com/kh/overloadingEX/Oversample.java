package com.kh.overloadingEX;

public class Oversample {
	
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a*b;
	}
	
	public double sum(double a,double b) {
		return a + b;
	}
	
	public double sum(double a, double b,double c) {
		return a + b + c;
	}
	
	public double sum(double a, double b, double c, double d) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		Oversample oversample1 = new Oversample();
		
		System.out.println(oversample1.sum(10,2));
		System.out.println(oversample1.sum(10,2,5));
		System.out.println(oversample1.sum(1.5,1.6));
		System.out.println(oversample1.sum(1.2,1.3,1.4));
		System.out.println(oversample1.sum(1.3,4.12,3.4,4.2));

	}

}
