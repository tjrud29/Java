package com.kh.exceptionSample;

public class ExceptionMain {
	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
		exmain.ExceptionF();
		exmain.ExceptionExam();
		
		
	}
	public void ExceptionA() {
		try {
			int result = 10/0; 
			System.out.println(result);
		}catch (ArithmeticException e) {
			/*
			 ArithmeticException : 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e : e는 우리가 정한 변수명
			 e로 지정한 변수로 메세지를 getMessage()로 전달 받음
			 * */
			
			System.out.println("산술 연산으로 인해 발생한 에러!" + e.getMessage());
		 }
	}
	public void ExceptionF() {
		try {
		String juminNumber = "팔오공904";
		int number = Integer.parseInt(juminNumber);
		System.out.println("숫자 : " + number);
	} catch (NumberFormatException N) {
		System.out.println("숫자만 넣어주세요");
		System.out.println(N.getMessage());
	}
	
		
		
		
		
	}	
	public void ExceptionExam() {
		try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;
		int result = numbers[index];
		System.out.println(result);
		}catch (ArrayIndexOutOfBoundsException array) {
			System.out.println("배열 인덱스 범위 벗어남");
		}catch (Exception e) {
			System.out.println("배열 인덱스 범위를 벗어나지않고 일반적인 다른 오류 발생");
		}finally {
			//항상 실행되는 블록
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료되었습니다");
	}

}
