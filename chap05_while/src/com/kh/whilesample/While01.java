package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		
		while(isTrue) { //isTrue == true이기 때문에 true대신에 isTrue 사용
			System.out.println("커피 주문해주세요. 1.아메리카노 2.카푸치노 3.말차밀크티");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("아메리카노");
				isTrue = false;//while문을 종료하기 위해서 false를 집어 넣는다..
				
				break;
			case 2:
				System.out.println("카푸치노");
				isTrue = false;
				break;
			case 3:
				System.out.println("말차밀크티");
				isTrue = false;
				break;
			default :
				System.out.println("잘못된 주문입니다");
				
			}	
	   }

	}

}
