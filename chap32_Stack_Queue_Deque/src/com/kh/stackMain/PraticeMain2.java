package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class PraticeMain2 {

	public static void main(String[] args) {
		PraticeMain2 pm2 = new PraticeMain2();
		
		pm2.PraticeQueue();
	}
	
	
	
	public void PraticeQueue() {
		//큐에 요소 추가 반환 삭제하고 while 사용해보기
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("dangdangi");
		queue.offer("mongmongi");
		queue.offer("sarangi");
		
		queue.poll();
		System.out.println(queue);//반환 및 삭제
		
		while(!queue.isEmpty()) {
			queue.poll();
			System.out.println(queue);
		}
		
	}
}
