package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//리스트 인터페이스 링크드리스트 객체 활용해서 값 넣고 출력
		//String 값 넣고 수정 삭제 출력
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		System.out.println(linkedList);
		
		linkedList.remove(0);
		System.out.println(linkedList);
		
		
		//LinkedList 객체 new LinkedList 객제
		//int 값 넣고 수정 삭제 출력
	}

}
