package com.kh.whilesample;

public class whilesample {

	public static void main(String[] args) {
		//while문
		/*
		 특정 조건이 참인 동안에 반복적으로 코드블록을 실행하는 제어 구조
		 조건이 참인지 거짓인지 검사 한 후, 조건이 참인 동안 코드블록 실행
		 조건이 거짓이면 반복이 중지
		 
		 while 문의 특징
		 while 문의 조건이 참인동안 코드블록을 계속해서 반복적으로 실행
		 조건이 처음부터 거짓이면 코드블록 실행 안됨
		 조건이 항상 참이면 무한루프에 빠질 수 있으므로 조심
		 코드블록 실행 전에 검사하기 때문에 조건이 처음부터 거짓이면 실행 안됨
		 while (조건) {
		 //조건이 참인 동안 실행될 코드
		  }
		 * */
		int count = 1;
		while (count <= 5) {
			System.out.println("반복 :" + count);
			count++;//반복 횟수를 증가 시킴
				}
		
		
		
		
		
		
		
		
	}

}
