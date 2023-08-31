package com.kh.whilesample;

public class while04 {

	public static void main(String[] args) {
		int sum = 0;//최종 합
		int num = 1;
		
		while(num <= 5) {
			System.out.println("num 은 :" + num);
			sum = sum + num;  
			num = num + 1;
			System.out.println("sum 은 :" + sum);
			 //sum의 합을 주기적으로 보기를 원하면 while문 안에 작성
			
			
			/*
			 while이 종료 되었다고 해서 클래스가 종료된 것은 아님
			 while이 종료된 후 남아있는 System.out.println(sum)이 출력됨
			 * */
			
			
		}
		

	}

}

