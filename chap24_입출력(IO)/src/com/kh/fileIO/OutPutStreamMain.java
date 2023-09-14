package com.kh.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamMain {
/*
 FileOutputStream
  이진 데이터를 파일에 쓰기 위해 사용
  입출력 작업을 처리하기 위한 클래스
 * */
	public static void main(String[] args) {
		//파일에 쓸 경로를 지정
		String filePath = "ex.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			
			String data = "안녕하세요";
			//문자열을 바이트 배열로 변환하고 파일에 쓰자
			byte[] bArray = data.getBytes();//getBytes() 메서드를 사용해서 바이트로 변환
			try {
				fos.write(bArray);
				
				//FileOutputStream 해지
				fos.close();
				System.out.println("데이터가 파일에 쓰여짐");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
