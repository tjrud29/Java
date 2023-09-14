package com.kh.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PraticeCopy {

	public static void main(String[] args) {
		//이미지 파일 jpg 또는 png 파일 바탕화면에 저장 후
		//바탕화면에 폴더 생성하고 폴더 안에 복사한 이미지 저장하기
		PraticeCopy pc = new PraticeCopy();
		pc.pratice1();
	
		
		
	}
	public void pratice1() {
		
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String outputFolder = "C:\\Users\\user1\\Desktop\\img.jpg";
		
		File ss = new File(inputFile);
		
boolean success = ss.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFolder)){
			byte [] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사되었습니다");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
		
		
		}
		
		
		
		
	}


