package com.kh.inheritance.animal;

public class cat extends Animal{

		public  cat(String name) {
		super(name);
	
		}
		@Override 
		// animal에 적혀있는 eat을 고양이 안에서만 다시 정의내린다
		public void sleep() {
			System.out.println(getName() +"잔다");
		}
	}


