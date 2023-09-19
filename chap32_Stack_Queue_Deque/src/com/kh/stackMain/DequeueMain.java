package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		/*
		 *    시작                         끝
		 *     |                          |
		 *     v                          v
		 *    [first] <-> [second] <-> [third]
		 *  ^                                   ^
		 *  |                                   |
		 *[    ]                              [    ]
		 * */
		//ArrayDequeue사용하여 Dequeue 생성
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("First");
		deque.addLast("Last");
		
		//맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		//맨 앞과 맨 뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		System.out.println(deque.isEmpty());
	}

}
