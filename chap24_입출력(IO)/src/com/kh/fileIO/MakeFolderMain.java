package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		MakeFolderMain sc = new MakeFolderMain();
		sc.pratice2();
		//폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop//new_folder"; //원하는 경로 설정
		
		
		//폴더만들기
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다");
		}
		
		FileWriter w;
		try {
			w = new FileWriter("C:\\Users\\user1\\Desktop//new_folder//dd.txt");
			w.write("유저 정보를 담는 곳입니다.");
			w.write("kh학생");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void pratice2() {
		String folderPath = "C:\\Users\\user1\\Desktop//new_folder";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더생성완료");
		}else {
			System.out.println("폴더 이미 존재함");
		}
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\user1\\Desktop//new_folder//하이하이.txt");
			fw.write("하이루 방가");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
