package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain sc = new ReplaceMain();
		sc.replace2();
		sc.replace3();
		sc.replace4();
		sc.replace5();
		sc.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-","");
		System.out.println(input2);
		
	}
	
	public void replace2() {
		String input = "Hello World";
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3(){
		String originName = "Hello world";
		//o로 적혀 있는 문자열들 x로 치환하기
		String reoriginName = originName.replace("o", "x");
		System.out.println("reoriginName : " + reoriginName);
		
		
	}
	public void replace4() {
		String originString = "The quick brown fox jups over the lazy dog";
		//fox를 cat로 바꾸기
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
	}
	public void replace5() {
		//모든 공백 제거
		String originString = "The quick brown fox jups over the lazy dog";
		String reoriginString = originString.replace(" ", "");
		System.out.println("공백제거 :" + reoriginString);
	}	
	public void replaceAll() {
		String originString = "Hello World";
		//replace 대신 replaceAll을 이용해서 대소문자 구분 없이 문자열 치환하기
		String reAllStr = originString.replaceAll("(?i)world", "hi" );
		System.out.println(reAllStr);
	}
}
