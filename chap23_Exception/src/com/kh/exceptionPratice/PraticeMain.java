package com.kh.exceptionPratice;

public class PraticeMain {

	public static void main(String[] args) {
		PraticeMain pr = new PraticeMain();
		pr.ArithException();
		pr.NPException();
		pr.NumFormatException();
		
	}
	public void ArithException() {
		//100나누기 0 적기
		
		try {
			int dividend = 100;
		int divisor = 0;
		int result = dividend / divisor;
		System.out.println(result);
		}catch (ArithmeticException ar) {
			System.out.println(ar.getMessage());
		}
			
		 
			
	}
	
	public void NPException() {
		try {
		String text = "Hello World";
		String subText = null;
		int length = text.indexOf(subText);
		}catch (NullPointerException np) {
			System.out.println(np.getMessage());
		}
			
			
		
		
	}
	
	public void NumFormatException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		}catch(NumberFormatException num) {
			System.out.println(num.getMessage());
		}
	}

}
