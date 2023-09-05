package com.kh.classAM;

public class otherAM {
	//AM 생성
	public static void main(String[] args) {
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		//am.privateMethod(); 같은 클래스가 아니라 출력이 안됨(private접근제한자의 특성)
	}
}
