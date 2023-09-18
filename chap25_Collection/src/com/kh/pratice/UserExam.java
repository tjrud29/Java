package com.kh.pratice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map <String, Integer> people = new HashMap<>();
		
		
		people.put("나나", 89);
		people.put("혜정", 49);
		people.put("지효", 125);
		
		String peopleName = "지효";
		
		if(people.containsKey(peopleName)) {
			int numbers = people.get(peopleName);
			System.out.println(peopleName + "의 나이는" + numbers + "살입니다.");
		}else {
			System.out.println(peopleName + "나이를 찾을수 없음");
		}
		
	}

}
