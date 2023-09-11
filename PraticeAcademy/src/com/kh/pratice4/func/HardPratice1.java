package com.kh.pratice4.func;

import java.util.Scanner;

public class HardPratice1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);//입력 받기 위해 사용하는 메소드
			System.out.println("숫자를 입력해주세요");//출력 메소드
			int num = sc.nextInt();//카멜케이스로 nextInt적어주자
			
			int count = 1; //count를 1로 초기화 소수가 아닌 수의 개수를 나타냄
			
			if (num <= 2) {
				System.out.println("잘못 입력하셨습니다");
			}else {
				boolean checkNum = true;//소수 여부를 판단하기 위한 boolean변수 checkNum초기화 처음에는 소수로 가정
				for(int i = 2; i <=num; i++) {//2부터 입력받은 숫자 num까지의 소수를 판단하기 위한 반복문
					for(int a = 2; a*a <= i; a++) {
						//입력받은 숫자가 아닌 현재 숫자 i가 소수인지 판단하기 위한 반복문
						
						if ( i % a ==0) {//만약에 소수가 아닐 경우
							
							checkNum = false;
							count++;
							break;
						}
						if(checkNum) {
							//소수 일 때 값을 출력
							System.out.println(i); //출력 메소드 작성	
						}
						checkNum = true;
					}
					System.out.println("소수의 총 갯수 :" + (num - count));//모든 숫자 검사가 끝난 후,
					//소수의 총 개수를 출력
				}
				
			}
			
			
	}

}
