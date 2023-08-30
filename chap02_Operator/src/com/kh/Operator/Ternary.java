package com.kh.Operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항연산자
		/*
		 * 
		 삼항 = 일항 ? 이항 : 삼항
		 조건을 평가하고 세 가지 값 중 하나를 반환합니다.
		 조건 ? 값1 : 값2 형태로 사용
		 값 1은 조건이 참일 때 출력
		 값 2는 조건이 거짓일 때 출력
		 * */
		//ex) 나이가 20. 성인인가 미성년자인가?
		int age = 20;
		//조건
		String status  = (age >=20) ? "성인" : "미성년자";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "합격" : "불합격";
			System.out.println(result);
			
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign :" + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "적당한 날씨" : "추운 날씨";
		System.out.println(weather);
		
		//숫자 7의 값이 짝수인지 홀수인지 출력
		int number1 = 7;
		String ZZac = (number1 % 2 ==0 ) ? "짝수" : "홀수";
		System.out.println(ZZac);
		
		int number2 =-5;
		//false이면 다른 항으로 넘어감
		String sign2 = (number2 > 0)? "양수" : (number < 0) ? "음수" : "0";
		System.out.println(sign2);
		
		
		
		
		
		
		
		
	}

}
