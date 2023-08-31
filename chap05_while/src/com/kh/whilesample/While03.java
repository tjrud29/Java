package com.kh.whilesample;

public class While03 {
	public static void main(String[] args) {
		//반복적으로 출력
		int i = 1;
		while (i <= 10) {//i가 5보다 작거나 같을 때 true라면?
			System.out.println(i);
			++i;
			/*
			 i++일때 i가 1인 값을 먼저 대입 했기 때문에 ++가 작동안함
			 무한루프 발생
			 ++i일 때는 i에 +1을 먼저 대입
			 1~10까지 출력가능하고 무한루프 발생 안함
			 * 
			 * */
			
		}
	}

}
