package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	//@Override
	public void printMenu() {
		System.out.println("ÁÖ¹®³»¿ª");
		
	}
}