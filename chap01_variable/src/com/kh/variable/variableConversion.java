package com.kh.variable;

public class variableConversion {
	public static void main(String[] args) {
	//1. 자동형변환(암시적형변환,묵시적형변환)
	int intNum = 100;
	System.out.println(intNum);//intNum : 숫자 100을 의미
	long longNum = intNum;//int를 long로 자동 형변환
	System.out.println(longNum);
	
	float floatNum = 3.14f;
	double doublenum = floatNum;//float을 double로 자동 형변환
	System.out.println(doublenum);

	
	//int > long 변경하는 형변환 2가지 만들기
	int intNum2 = 10;
	long shortNum2 = intNum2;
	System.out.println(shortNum2);
	int itit = 20;
	long lglg = itit;
	System.out.println(lglg);
	
	//short > int 변경하는 형변환 1가지 만들기
	short sht = 20;
	int int3 = sht;
	System.out.println(int3);
	
	//float > double 변경하는 형변환 1가지 만들기
	float ft = 12.123f;
	double db = ft;
	System.out.println(db);
	
	//2.강제 형변환(명시적 형변환)
	//long > int
	long largeLong = 12345L;
	System.out.println(largeLong);
	int largeInt = (int) largeLong; //(int)를 추가하면 강제로 형변환 가능                                                                     
	System.out.println(largeInt); // long을 int로 강제 형변환 할 경우 값이 범위 안에 있지 않으면 일부데이터 손실된다
	
	double largeDouble1 = 12345.6789;
	int intpart = (int)largeDouble1;
	System.out.println(intpart);//실수를 정수로 강제 형변환 할 경우에는 정수 부분만 유지
	
	
	//문자는 char charbalue = 'Z'; > int로 변경 2개 출력
	char charbalue = 'Z';
	int it1 = charbalue;
	System.out.println(it1);
	char charbalue1 = 'A';
	int intbalue = charbalue1;
	System.out.println(intbalue);
	
	//double > int로 형변환 출력 1개
	double aa = 22.1;
	int ii = (int)aa;
	System.out.println(ii);
	
	//int를 short로 형변환 1개
	int in1 = 21;
	short sh1 = (short)in1;
	System.out.println(sh1);
	
	
	
	
	
	
	
	}
	}

