package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	boolean ischoice = false;
	
	while (!ischoice) {//느낌표를 사용하여 ischoice를 true로 만듦
		System.out.println("계절을 선택해주세요");
		
		int month = sc.nextInt();
	
	switch (month) {
	case 12 : case 1: case 2:
		ischoice = true;//case 3개 중 하나라도 참이면 출력//case3개가 묶어져서 break 하나에 다 멈춤
		System.out.println("겨울");
		break;
		
	case 3 : case 4 : case 5 :
		ischoice = true;//위 느낌표가 있을 경우에는 참은 거짓으로 변경되고 거짓은 참으로 변경되기때문에 true로 작성해주어 false를 유도해준다
		System.out.println("봄");
		break;
	case 6 : case 7 : case 8 :
		ischoice = true;
		System.out.println("여름");
		break;
	case 9 : case 10 : case 11 :
		ischoice = true;
		System.out.println("가을");
		break; //break는 case문에서 실행하고자 하는게 종료된 후에 써야함
		default :
			System.out.println("다시 선택");
	}
	}
	//나이를 입력받아 성인 청소년 어린이로 분류하고 출력하기
	//while switch case이용
	//성인(19~20)
	//청소년(14~17)
	//어린이(10~13)
	//이외 나이는 다시 입력
	//놀이공원을 입장하는데에 9살 이상만 입장 가능
	
	boolean isFalse = false;
	
	while(!isFalse) {//반복문을 true나 false로 설정하면 구문이 멈추지 않고 계속 실행되기 때문에 변수를 이용해서 
		//원할 때 멈출수 있다.
		//while문을 사용하는 이유는 만약에 잘못된 값을 입력하면 다시 입력할 수 있기 때문
		System.out.println("나이를 입력하세요");
		
		int iage = sc.nextInt();
		
		switch (iage) {
			case 10: case 11 : case 12: case 13:
				System.out.println("어린이");
				isFalse = true;
				break;
			case 14 :case 15 : case 16: case 17:
				isFalse = true;
				System.out.println("청소년");
				break;
			case 19: case 20 : 
				isFalse = true;
				System.out.println("성인");
				break;
				
			default :
				System.out.println("다시입력해주세요");
				
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	}

}
