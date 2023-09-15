package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
			//정수형 데이터를 저장하는 book 인스턴스 생성
		Book<Integer> intBook =new Book<>();
		intBook.put(42);
		intBook.put(23);
		int intvalue = intBook.get(); //형변환 필요 없음
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("안녕안녕~~");
		strBook.put("집가고싶다!!");
		String strValue = strBook.get();
		
		//제네릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고 출력 가능
		System.out.println("int value : " + intvalue);
		System.out.println("String value : " + strValue);
		
		
	}

}
