package com.kh.api.exam1;

public class PraticeMain2 {

	public static void main(String[] args) {
		PraticeMain2 zz = new PraticeMain2();
		zz.pratice1();
		zz.pratice2();
		zz.pratice3();
		zz.pratice4();
		zz.pratice5();
		
		
	}
	public void pratice1() {
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã");// + Àú³á ¹¹¸ÔÁö
		sb.insert(1, "Àú³á ¹¹¸ÔÁö");
		System.out.println(sb.toString());
		
	}
	public void pratice2() {
		//¹®ÀÚ¿­ µÚÁı±â
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´ÃÀú³á¹¹¸ÔÁö");
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void pratice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ¤¾¤¾ ³Ö±â
		  String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		  StringBuffer sb = new StringBuffer(str);
		  sb.insert(8, "?¤¾¤¾");
		  System.out.println(sb.toString());
	}
	
	public void pratice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(, ,)
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		 StringBuffer sb = new StringBuffer(str);
		 sb.replace(0, 20, ",");
		 System.out.println(sb.toString());
	}
	
	public void pratice5() {
		//¹®ÀÚ¿­ »èÁ¦
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		 StringBuffer sb = new StringBuffer(str);
		 sb.delete(1, 20);
		 System.out.println(sb.toString());
		 
	}
}
