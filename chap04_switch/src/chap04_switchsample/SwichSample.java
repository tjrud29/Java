package chap04_switchsample;

public class SwichSample {

	public static void main(String[] args) {
		// switch문
		/*
		 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 switch문은 일련의 case문과 해당 값을 비교하여 일치하는 경우에 코드블록 실행
		 각 case문 뒤에는 일치하는 값이나 표현식이 나옴
		
		switch( 변수 또는 표현식)
			case 값1 :
			//값 1에 해당하는 코드
			 break; // 해당 블록의 실행을 중단하는 역할
			case 값2 :
			//값 2에 해당하는 코드
			 break;
			default : 
			 //위의 모든 케이스와 일치하지 않을 때 실행되는 코드
		 * */
		int day = 5;
		switch (day) { // day == 30
		case 1 : //case가 30이면 월요일 출력 //30이 아니기 때문에 false
			System.out.println("월요일");//출력 안됨
			break;
		case 2 :
			System.out.println("화요일");
			break;
		case 30 :
			System.out.println("수요일");
			break;
			default :
			System.out.println("주말");
			
		
		}
		
		int choice = 3;
		switch (choice) {
		
		case 1 :
			System.out.println("아메리카노");
			break;// 브레이크를 선언하지 않으면 실행결과가 참이라고 해도 아래의 케이스들까지  실행된다.
		case 2 :
			System.out.println("아인슈페너");
			break;
		case 3 : 
			System.out.println("카페라떼");
			break;
		case 4 :
			System.out.println("핫초코");
			break;
			 
			default :
				System.out.println("주문취소");
		}
		
			
		
		
			
	}

}
