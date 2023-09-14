package com.kh.fileIO;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.pratice1();
		pm.pratice2();
		pm.pratice3();
	}
	public void pratice1() {
		//폴더 연속으로 2개 만들기  
		//폴더 연속으로 3개 만들기   
		//폴더 연속으로 5개 만들기    
		
		String dirPath = "C:\\Users\\user1\\Desktop\\dog\\maltiz";
				
		File dir = new File(dirPath);
		
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}
	public void pratice2() {
		String dirPath = "C:\\Users\\user1\\Java_workspace\\chap25_";
		
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
	}
	
	public void pratice3() {
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Koraen\\kPop\\Group";
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}
}
















