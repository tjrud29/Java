package com.kh.objexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PraticeMain4 {

	public static void main(String[] args) {
		PraticeMain4 ss = new PraticeMain4();
		ss.pratice2();
		ss.pratice3();
		ss.pratice4();
		
	}
	public void pratice2() {
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("현재 날짜 : %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	public void pratice3() {
		int num1= 123;
		int num2 = 7;
		
		String number = String.format("숫자 1 : %05d, 숫자2 : %d",num1, num2);
				System.out.println(number);
		//String 변수명 =String.format("숫자 1:   , 숫자2 : " ,   ,  );
		//system.out.println(변수명);
	}
	public void pratice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10은 최소 넓이 
		//만약 문자열이 10자리보다 짧다면 왼쪽에 공백으로 채워짐
		//만약 문자열이 10보다 짧다면 오른쪽이 공백
		//'따옴표로 둘러 쌓아야함
		String formatpr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatpr);
	}
}
