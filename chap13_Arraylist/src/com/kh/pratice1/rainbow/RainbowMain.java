package com.kh.pratice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println(colors); 
		
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		System.out.println(colors);
		
		colors.set(1, "검정");
		colors.set(3, "갈색");
		colors.set(5, "그린");
		System.out.println(colors);
		//1번 자리에 옐로우 추가
		//기존 1번 검정은 2번으로 바뀜
		colors.add(1,"옐로우");
		System.out.println(colors);
		//검정 삭제
		colors.remove(2);
		System.out.println(colors);
		for(String  a : colors) {
			System.out.println(a);
		}
		System.out.println("최후출력 : "+colors.get(1) + colors.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
