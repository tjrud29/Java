package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
  			java1.1이후 권장 X
  				java.time 패키지 LocalDate LocalTime LocalDateTime
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 :" + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		//현재 날짜 및 시간
		LocalDateTime cldt = LocalDateTime.now();
		System.out.println(cldt);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		
		//날짜 추가
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate );
		
		LocalDate minusDate = today.minusDays(6);
		System.out.println("6일 전 날짜" + minusDate);
		
		LocalDate minusYear1 = today.minusYears(5);
		System.out.println("5년 전 연도" + minusYear1);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		if(date1.isBefore(date2)) {	
			System.out.println("date1이 늦음");
		}else if (date1.isAfter(date2)) {
			System.out.println("date1이 빠름");
		}else {
			System.out.println("날짜 같음");
		}
		
	}
}










