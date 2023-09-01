package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class fasdfsda {

	public static void main(String[] args) {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	//	1~입력값 까지 배열에 초기화한 후 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		int num = sc.nextInt();
		
		int[] arr = new int[num];//5를 넣으면 01234 arr[5] = 4
		//5를 넣으면 12345가 나와야함
		for(int i = 0; i < num ;i++) {
			arr[i] = i +1;
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
	}

}
