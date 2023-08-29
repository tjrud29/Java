package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1.변수의 이름은 영문자,숫자,언더스코어(_),달러($)로 구성가능
		
		// 2.변수의 이름은 숫자로 시작할 수 없다.
		
		// 3.변수 이름 사이에는 공백 불가
			//언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문.
		
		// 4.자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다.
		// ex) int int =1; 에러 뜸
		
		
		//1.실수형 (float, double) 
		float pie1 = 3.1415513552233f; //float은 f나 F를 작성해준다
		double pie2 = 3.1415513552233;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double :");
		System.out.println(pie2);		
		
		
		//2.정수형(byte,short,int,long)
		//byte : 이는 -128~127까지 사용 가능
		//byte bt = -129; 실행 안됨. int로 변경하거나 값을 byte + byte로 넣어줘야 한다
		byte bt = 127;
		System.out.println(bt);// -129와 128 이상부터 출력 불가능
		//short = -32,768 ~ 32,767 사용가능
		//short shrt = -32769; 실행 안됨. -32,769와 32,768 이상부터 출력 불가능
		short shrt = -32767;
		System.out.println(shrt);
		//int 는 -2,147,483,648 ~ 2,147,483,647 까지 출력 가능
		//long 는 -9,223,372,036,854,775,828~
		long lng = 2000l; //long은 뒤에 l이나 L을 붙여준다
		
		
		
		//3.문자형(String,char)
		//String은 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨
		//기본적인 자료형에 들어가지 않기 때문에 String으로 표현됨
		//String은 ""나 ''안에 글자를 작성 할 것
		String name = "안녕하세요";
		//char : 문자형 문자를 한문자만 포함 가능
		//char : ''안에 글자를 작성 할 것
		char chr1 = 'a';
		System.out.println(chr1);
		
		
		//4.논리형
		//boolean 은 true와 false 를 표현한다
		//사용방법 : boolean bln = true; false;
		boolean bln1 = true;
		System.out.println(bln1);
		boolean bln2 = false;
		System.out.println(bln2);
		
		
		System.out.println("안녕하세요. 저는 홍길동입니다.");
		String name1 = "홍길동";
		System.out.println("안녕하세요.저는" + name1 + "입니다.");
		//한 번 타입을 선언한 변수는 재선언을 하지 않고                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ㅗ그대로 사용 가능
		//한 번 선언한 타입을 다른 타입으로 재선언 불가
		//선언한 타입을 다른 타입으로 변경해서 선언 불가
		name1 = "박철수";
		System.out.println("안녕하세요. 저는" + name1 + "입니다.");
		int age = 23;
		String soccer = "축구입니다.";
		System.out.println("안녕하세요. 저는" + name1 + "입니다." );
		System.out.println("저의 나이는" + age + "이고," );
		System.out.println("저의 취미는" + soccer);
		
		char score = 'a';
		System.out.println("저의 성적은" + score + "입니다.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
