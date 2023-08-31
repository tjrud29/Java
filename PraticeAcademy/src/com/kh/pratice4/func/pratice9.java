package com.kh.pratice4.func;

import java.util.Scanner;

public class pratice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int num = sc.nextInt();//num은 단 수
		int result = 0;//결과값
		
		if (num>9) {
			System.out.println("1~9까지의 숫자를 입력하세요.");
		}else {
			for(int k =num; k<=9; k++) {//단수 4단이라고 가정할 때
				System.out.println(k+"단");
				for(int i = 1; i <10; i++ ) {
					result = k * i;
					
					System.out.println(k + "*" +i + "="+result);
					
					
				
				}
			}
		}
				
			
			
		}

	}


