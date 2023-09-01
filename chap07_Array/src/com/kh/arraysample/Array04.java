package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		
	String[] inturnArray = {"±è°æ³­", "±è¸»¶Ë" , "È«±æµ¿", "¹ÚÃ¶¼ö", "ÇãÇãÇã"	};
		
		inturnArray[3] = "±èÇÑ³ª";
		System.out.println("¹ÚÃ¶¼ö ´ë½Å " + inturnArray[3]);
		
		String[] fruits = {"»ç°ú", "µþ±â", "Å°À§", "¸Þ·Ð" ,"±Ö"};
		
		fruits[0] = "¹Ù³ª³ª";
		fruits[1] = "¼ö¹Ú";
		fruits[2] = "·¹¸ó";
		fruits[3] = "±Ö";
		fruits[4] = "¿À·»Áö";
				
		for(int i = 0;i< fruits.length;i++  ) {
				System.out.println(fruits[i]);
		}
}
}