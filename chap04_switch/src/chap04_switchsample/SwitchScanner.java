package chap04_switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과자를 선택해주세요");
		
		/*int fruit = sc.nextInt();
		switch (fruit) {
		case 1:
			System.out.println("사과");
			break;
		case 2:
			System.out.println("포도");
			break;
			default :
			System.out.println("잘못된 선택입니다");
		
		
		}*/
		
		/*System.out.println("1.아메리카노");
		System.out.println("2.핫초코");
		System.out.println("3.말차라떼");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("아메리카노 주문하셨습니다.");
			break;
		case 2:
			System.out.println("핫초코를 주문하셨습니다.");
			break;
		case 3:
			System.out.println("말차라떼를 주문하셨습니다.");
			break;
			
			default : {
				System.out.println("주문취소 되었습니다.");	
			}
		}
	*/
		
	
		
		int snack =sc.nextInt();
		
		switch (snack) {
		case 1:
			System.out.println("초코바");
			break;
		case 2:
			System.out.println("포카칩");
			break;
		default : 
			System.out.println("주문취소 되었습니다.");	
		}
		
	
	
	
	
	
	}
		
		
		
		
	
	
	}


