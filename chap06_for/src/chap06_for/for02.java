package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		//구구단
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		int result = 0;//최초 값을 0으로 줍니다.
		for(int i = 0; i<num2; i++) {//for 루프를 사용해서 i변수를 0부터 num2미만까지 반복
			result += num1;//result변수에 num1변수를 더함
			System.out.println("안" + num1+ "첫번째" + num2 + "두번째" + result);
		}
		
			System.out.println(num1+ "첫번째" + num2 + "두번째" + result);
			//계산된 결과를 출력 입력받은 두 숫자와 결과값을
			
			
			
				
				
			}
			
			
		
		
		
		
	}


