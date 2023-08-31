package com.kh.pratice4.func;

import java.util.Scanner;

public class pratice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б");
		int num	= sc.nextInt();		
		int result = 0;
		for(int i= 1;i <= 9; i++) {
			result = num * i;
			System.out.println(num+" * " + i + " = " + result);
		}
	}

}