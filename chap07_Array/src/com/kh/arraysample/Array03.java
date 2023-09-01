package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
			/*
			  문자열에 입력 받아 문자 하나 하나 배열에 넣고 검색할 문자가
			  문자열에 몇개 들어가 있는지 개수와
			  몇 번째 인덱스에 위치하는지 인덱스 출력하기
			  
			  
			  1.문자열에 입력
			  2.문자열의 문자 개수
			  3.해당 문자가 문자열의 몇 번째 문자
			 * */

			Scanner sc = new Scanner(System.in);
			
			System.out.println("문자열을 입력하세요");
			String inputString = sc.next();//문자열
			
			System.out.println("검색 할 문자를 입력하세요");
			char searchChar = sc.next().charAt(0);//문자 하나를 입력받음
			
			char[] charString = inputString.toCharArray();	//toCharArray >>문자열을 문자 배열로 변환하는 역할
			//String를 char로 바꿔줌
			//문자열을 문자로 반환
			//String >> char
			//안녕하세요 >> '안', '녕' ,'하', '세', '요'
			//검색 할 문자가 문자열에 몇 개 들어가 있는지 개수
			//몇 번째 인덱스에 위치하는지 인덱스 출력하기 
			
			int charCount = charString.length;
			System.out.println("문자열 개수  :" + charString.length );
			
			
			
			
				
	}

}
