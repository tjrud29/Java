 package com.kh.Operator;

public class Arithmetic {

	public static void main(String[] args) {
		//산술연산자 : 더하기(+), 빼기(-), 곱하기(*), 나누기 몫(/), 나누기 나머지(%)
		int num1 = 5;
		int num2 = 2;
		// 문자와 산술연산자를 같이 사용하면 괄호를 사용해야함
		System.out.println("더하기 :" + (num1 + num2));
		System.out.println("빼기 :" + (num1 - num2));
		System.out.println("곱하기 :" + (num1 * num2));
		System.out.println("나누기 :" + (num1 / num2));
		System.out.println("나머지 :" + (num1 % num2));
	
	}

}
