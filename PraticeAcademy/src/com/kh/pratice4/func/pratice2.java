package com.kh.pratice4.func;

import java.util.Scanner;
		
public class pratice2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num1 = sc.nextInt();
		
		boolean isfalse = false;
		while (!isfalse) {
		if(num1 <1) {
			System.out.println("1 이상의 숫자를 입력하시오.");
			} else {
				for(int i = 1; i<=num1; i++)
					System.out.println(i);
			}
				isfalse = true;
				
				System.out.println("다시 선택하세요");
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
