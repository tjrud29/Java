package com.kh.instance.tv;

public class Tv {
	//Tv 제작
	//tv 속성(필드)
	String color;//tv 색상
	boolean power;//전원 상태
	int channel;//채널
	
	//tv 기능(메서드)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
