package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPratice2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("국어점수 :");
			double kor = sc.nextDouble();
			
			System.out.println("영어점수 :");
			double eng = sc.nextDouble();
			
			System.out.println("수학점수 :");
			double mat = sc.nextDouble();
			
			int	averageScore = (int)(kor + eng + mat);
			int totalScore = (averageScore / 3);
			System.out.print("국어점수" + kor + "영어점수" + eng + "수학점수" + mat + "총점 =" + averageScore + "평균점수" + totalScore    );
			
			

	}

}
