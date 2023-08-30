package com.kh.ifsample;

public class IfElseIfsamle {
	public static void main(String[] args) {
		//if -else if esle
		/* 
		 여러개의 조건을 연속적으로 평가
		 
		  그 중 첫번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		  만약 if나 else if의 조건이 참이 아니라면 마지막 else 블록 실행
		  
		  if(조건1){
		  //조건 1이 참일 때 실행되는 코드
		  } else{
		  //조건 2가 참일 때 실행되는 코드
	      } else{
	      //위의 모든 조건이 거짓일 때 실행되는 코드
	      }
		  
		 * */
		
		int age = 20;
		if (age>=20) {
			System.out.println("나는 해외여행을 갈거야!");
		} else if (age >= 20) {
			System.out.println("세계여행을 갈거야!");//else if는 조건을 걸수 있다

		}else {
			System.out.println("나는 집에 있을래");//else는 조건을 못검
		}
		
		//int score = 85;
		/*
		 만약에
		 90점이면 B+
		 90점이 넘으면 A
		 90점 미만이면 B
		 * */
		
		
		int score = 100;
		if (score >90 ) {
			System.out.println("당신의 점수는 A입니다.");
		} else if(score == 90) {
			System.out.println("당신의 등급은 B+입니다.");
		} else {
			System.out.println("당신의 등급은 B입니다.");
		}
		
	
		int hour = 12;
		if (hour < 16) {
			System.out.println("좋은 아침입니다.");
		}else if (hour < 18) {
			System.out.println("열심히 코딩합니다.");
		}else {//18시 이후
			System.out.println("수고하셨습니다.");
		}
		
		//날씨체크
		int temp = 28;
		if (temp > 30) {
			System.out.println("더운 날씨입니다.");
		}else if (temp>20) {
			System.out.println("적당한 날씨입니다.");
		}else {
			System.out.println("쌀쌀한 날씨입니다.");
		}
	
		int num = -5;//0보다 클 때 참 (true)
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {//0보다 닥을 때 참 (true)
			System.out.println("음수입니다");
		} else {//0일 때 참 (true)
			System.out.println("0입니다.");
		}
		
		/*
		 int age = 15일 때 
		 청소년인지 어린이인지 성인인지를 출력하시오
		 * */
		int age1 = 15;
		if (age1 >= 20) {
			System.out.println("성인입니다.");
		}else if (age1 > 10) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("어린이입니다.");
		}
		
		//계절 출력하기
		
		int month = 6;
		if (month == 1 || month ==2 || month == 12) {//1,2,12월
			System.out.println("겨울");
		}else if (month >= 3 && month <= 5) {//3,4,5월
			System.out.println("봄");
		}else if (month >= 6 && month <=8); {//6,7,8월
			System.out.print("여름");
		} 
		
		
		
		
		
		
	}
	

}
