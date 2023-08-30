package com.kh.ifsample;

public class ifExam {

	public static void main(String[] args) {
		//중첩(이중) if문
		/*
		 if (조건식1) {
		 	if(조건식2){
				if(조건식3){
					}else if(조건식4){
					수행될 문장;
		 }else {
		 수행된 문장
		 }
		 else {
		 수행될 문장;
		 {
	
		 
		 * */

		//날씨에 따른 경보!
		int month = 1;
		int temp = -10;
		if (month == 1 || month == 2 || month ==12) {
			System.out.println("겨울");
			if (temp <= -15) {
				System.out.print("한파경보");
			} else if (temp <= -12) {
				System.out.print("한파주의보");
			}
		}else if (month>=3 && month <= 5) {
			System.out.println("봄");
		}else if (month>= 6 && month <=8) {
			System.out.println("여름");
			if(temp >= 35) {
				System.out.println("폭염 주의");
			}else if (temp >= 33) {
				System.out.println("폭염주의보");
			}
		}else if (month >= 9 && month <=11) {
			System.out.println("가을");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
