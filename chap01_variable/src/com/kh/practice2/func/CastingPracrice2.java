package com.kh.practice2.func;

public class CastingPracrice2 {
	public static void main(String[] args) {
		//실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요.
		
		double korean = 90.0;
		double english = 90.0;
		double math = 90.0;
		System.out.println("국어 : " + korean + "영어 :" + english + "수학 : " + math);
		int ikorean = (int) korean;
		int ienglish = (int) english;
		int imath = (int) math;
		
		
		
		
		System.out.println(ikorean + ienglish + imath);
		System.out.println((ikorean + ienglish + imath )/3);
	
	}
	

}
