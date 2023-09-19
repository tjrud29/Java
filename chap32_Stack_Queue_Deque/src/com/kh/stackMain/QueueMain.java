package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		//큐 Queue 생성
		Queue<String> queue = new LinkedList<>();
		
		/*	front     Rear(tail)
		 * 	  |			|
		 * 	  v			|
		 * +----+   +-----+
		 * |	|	|	  |      
		 * |1	|<- |2    | 
		 * |	| 	|	  |
		 * |____|	|_____|
		 * */
		
		//큐에 요소 추가
		queue.offer("Apple");
		queue.offer("banana");
		queue.offer("Cherry");
		
		//큐에서 요소 추출 및 출력(FIFO 순서대로 출력 됨)
		String removedElement = queue.poll(); //queue에서 Apple 제거하고 반환
		System.out.println(removedElement);
		
		removedElement = queue.poll(); //banana 제거하고 반환
		
		//큐의 front 요소 확인
		String frontElement = queue.peek();//queue의 front 요소 cherry반환
		
		//큐의 크기 확인
		int size = queue.size();
		
		/*
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}*/
	}

}
