package com.kh.stackMain;

import java.util.Stack;

public class PraticeMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack.contains(4));//false
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		stack.clear();
		System.out.println(stack);
		System.out.println(stack.empty());
	}

}
