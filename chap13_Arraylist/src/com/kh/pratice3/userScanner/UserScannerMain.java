package com.kh.pratice3.userScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개 정수 입력");
		int[] numbers = new int[5];
		//배열에 5개의 정수를 입력하는 포문
		for(int i = 0; i <5; i++) {
		numbers[i] = sc.nextInt();
		System.out.println(numbers[i]);
		}
		int sum = 0;
		for(int number1 : numbers) {
			sum += number1;
			System.out.println(sum);
		}
	}

}
                              