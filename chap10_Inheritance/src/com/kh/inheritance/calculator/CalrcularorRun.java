package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalrcularorRun extends Calculator{

	public static void main(String[] args) {
		//스캐너 이용해서 코드 변경하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("num2을 입력하세요");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result1 = cal.add(num1,num2);
		int result2 = cal.substruct(num1,num2);
		int result3 = cal.multiply(num1,num2);
		int result4 = cal.divide(num1,num2)	;
		System.out.println("Add :"  + result1);
		System.out.println("sub :"  + result2);
		System.out.println("mul :"  + result3);
		System.out.println("div :"  + result4);
}

}
