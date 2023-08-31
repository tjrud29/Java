package com.kh.pratice4.func;

import java.util.Scanner;

public class pratice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요!");
		
		int apple = sc.nextInt();
	
		if(apple < 1) {
			System.out.println("1 이상의 숫자를 입력하세요");
		}else {
			for(int i = apple; i > 0; i--) {
				
				
				
				System.out.println(i);
			}
		}
		
		

	}

}
