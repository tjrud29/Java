package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pratice4 {

	public static void main(String[] args) {
		Pratice4 xx = new Pratice4();
		xx.pratice1();
		xx.pratice2();
		xx.pratice3();
		xx.pratice4();
		xx.pratice5();
		
		
		
	}//yyyy-MM-dd-HH:mm:ss
		public void pratice1() {//년월일
			Date currentDate = new Date();
			SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
			String forDate = ss.format(currentDate);
			System.out.println(forDate);
		}
		public void pratice2() {//시분초
			Date currentDate = new Date();
			SimpleDateFormat ss = new SimpleDateFormat("HH:mm:ss");
			String forDate = ss.format(currentDate);
			System.out.println(forDate);
		}
		public void pratice3() {//월일
			Date currentDate = new Date();
			SimpleDateFormat ss = new SimpleDateFormat("MM-dd");
			String forDate = ss.format(currentDate);
			System.out.println(forDate);
		}
		public void pratice4() {//연도시간
			Date currentDate = new Date();
			SimpleDateFormat ss = new SimpleDateFormat("yyyy-HH");
			String forDate = ss.format(currentDate);
			System.out.println(forDate);
		}
		public void pratice5() {//날짜요일
			Date currentDate = new Date();
			SimpleDateFormat ss = new SimpleDateFormat("dd-EE");
			String forDate = ss.format(currentDate);
			System.out.println(forDate);
		}
}
