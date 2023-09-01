package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class ArrayPratice2 {

	public static void main(String[] args) {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6까지의 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		String[] arr = new String[7];// 0123456
		arr[0] = ("월");// String[] arr = {"월", "화", "수", "목"...}으로도 가능
		arr[1] = ("화");
		arr[2] = ("수");
		arr[3] = ("목");
		arr[4] = ("금");
		arr[5] = ("토");
		arr[6] = ("일");
		
		if(num <0) {
			System.out.println("잘못 입력하셨습니다.");
		} else if (num >6){
				
			System.out.println("잘못 입력하셨습니다.");
					
		}else {
			System.out.println(arr[num]);
			
		}
		
		
		
		
		
	}

}
