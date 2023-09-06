package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		//이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "banna", "cherry"},
				{"grapes", "Orange", "strawberry"},	
				{"kiwi","mange","pineApple"}
				
		};
		for(int i = 0;i < fruits.length; i++) {
			for(int a = 0; a< fruits[i].length; a++) {
				System.out.println(fruits[i][a] + "");
			}
			System.out.println();//다음행으로 이동할 수 있게 enter용 출력 메소드 입력
			
		}

		
		}
	}


