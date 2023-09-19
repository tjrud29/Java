package com.kh.stackMain;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack 값 추가 push	
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		
		/*
		 * |        |
		 * |	    |
		 * |	4   |	
		 * |	3   |	
		 * |	2   |
		 * |____1___|
		 * */
		//스택 값 삭제 및 반환 pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//stack 전체 값 제거(초기화)
		stack.clear();
		
		//stack 가장 상단의 값(가장 최근의 값)
		stack.peek();
		
		//stack 의 크기 출력
		stack.size();
		
		//stack empty :스택에 비어있는지 확인
		//비어있다면 true, 하나라도 들어있다면 false
		stack.empty();
		
		//stack에 1이 있는지 확인 1이 들어있다면 true
		stack.contains(1);
				
	}
}
