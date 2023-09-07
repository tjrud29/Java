package com.kh.ArrayListSample;

import java.util.ArrayList;

public class todosample {

	public static void main(String[] args) {
			//할 일 3개 만들고 수정 2개 하고 1개 지우고 올클리어하기
		
		ArrayList<String> todolist = new ArrayList<>();
		
		todolist.add("청소");
		todolist.add("공부");
		todolist.add("쇼핑");
		
		System.out.println("해야 할 일 가 : " + todolist);
		
		todolist.set(1,"운동");
		System.out.println("바뀐 할 일 : " + todolist);
		todolist.remove(1);
		System.out.println("일부가 지워진 할 일 : " + todolist);
		
		for(String aaaaa : todolist)
			System.out.println("할 일 목록 : " + aaaaa);
		
		todolist.clear();
		System.out.println("전부 지워진 할 일 : " + todolist);
		
		
	}

}
