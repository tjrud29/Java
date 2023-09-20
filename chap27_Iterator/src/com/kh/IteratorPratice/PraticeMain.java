package com.kh.IteratorPratice;

import java.util.ArrayList;
import java.util.Iterator;

public class PraticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		food.add("피자");
		food.add("김치찌개");
		food.add("아이스크림");
		food.add("바나나");
		
		Iterator<String> iter = food.iterator();
		
		while(iter.hasNext()) {
			String fod = iter.next();
			System.out.println(fod);
		}
		
		iter = food.iterator();
		while(iter.hasNext()) {
			String fod = iter.next();
			
		}
		//Iterator 이용하여 요소 삭제
			iter = food.iterator(); //다시 iterator을 초기화
			while(iter.hasNext()) {
			String fod = iter.next();
		//만약에 힙합이 들어오면 삭제하길 원함
			if(fod.equals("힙합")) {
			iter.remove();
			}
				System.out.println(fod);
			}
				
			//삭제 후 ArrayList 출력
			System.out.println("삭제 후 출력");
		for(String a : food) {
			System.out.println(a);
			}
		}
}