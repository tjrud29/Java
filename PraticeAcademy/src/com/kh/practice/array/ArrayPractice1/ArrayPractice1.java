package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		
		int num = sc.nextInt(); //스캐너 num 입력
		
		int[] arr = new int[num];//0,1,2,3,4
		
		for(int i = 0; i<arr.length; i++){
			//arr[0] = 1;
				arr[i] = 1 + i;
				System.out.println(arr[i]);
				
				
		}
		
		
		
		
		

	}

}
