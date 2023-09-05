package com.kh.example.pratice2.model.vo;

public class product2 {
	private String pName;
	private int price;
	private String brand;
	
	public product2(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	public void information() {
		System.out.println("pName :" + pName);
		System.out.println("price :" + price);
		System.out.println("brand :" + brand);
	}
	
}




	
