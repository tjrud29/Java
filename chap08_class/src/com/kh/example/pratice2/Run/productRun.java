package com.kh.example.pratice2.Run;

import com.kh.example.pratice2.model.vo.product;

public class productRun {

	public static void main(String[] args) {
		//product 생성 3개 하고 각각 상품명 가격 브랜드명 출력하기
		
		 product product1 = new product("아폴로",20,"제일제과");
		 product product2 = new product("소보루빵",10,"가장제과");
		 product product3 = new product("피자",26,"나폴리피자");
		
		 
		 
		 product1.information();
		 product2.information();
		 product3.information();
			 
		 
	}

}
