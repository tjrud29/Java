package com.kh.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String>{
	public int compare(String num1,String num2) {
		//길이가 같으면 0반환
		 if(num1.length() == num2.length()) {
			 return 0;
		 }
		//num1이 num2보다 길면 양수 반환
		 else if(num1.length() > num2.length() ) {
			 return 1;
		 }
		 //num1이 num2보다 짧으면 음수
		 else {
			 return -1;
		 }
	}
	public static void main(String[] args) {
		// List ArrayList 생성 Comparator 정리
		List<String> student = new ArrayList<>();
		student.add("nana");
		student.add("seoseo");
		student.add("hehe");
		student.add("djfoasdf");
		student.add("istsalamalaiqum");
		
		Collections.sort(student, new Student());
		
		for(String st : student) {
			System.out.println(st);
		}

	}
	

}
