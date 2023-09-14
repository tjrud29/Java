package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class InPutStreamMain {
/*
 FileInputStream
  파일을 읽을 때 사용되는 클래스 
  파일로 부터 데이터를 바이트 스트림으로 읽어들일 때 사용됨
 	int read() : 파일에서 다음 데이터를 읽고 반환
 	더 이상 읽을 데이터가 없으면 -1을 반환
 	int read([byte[] b): 파일에서 바이트 배열 'b' 데이터를 읽고 실제로 읽은
 	바이트 수를 반환
 	int read(byte[] b , int off, int len) : 파일에서 바이트 배열 'b'의 오프셋 위치부터 최대 len 바이트
 	만큼 읽어서 실제로 읽은 바이트 수를 반환
 	void close() 파일 닫기   
 * */
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = null;
			//경로는 현재 작성하고 있는 이클립스 파일 /파일 이름 설정
			
			String fileName = "exam.txt";
			try {
				FileWriter w = new FileWriter(fileName);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			fis = new FileInputStream(fileName);
			
			int data;
			
			//파일에서 데이터를 읽어들여서 출력
			System.out.println("파일 만드는 객체까지 성공");
			try {
				data = fis.read();
				System.out.println("파일 읽기 성공");
			} catch (IOException e) {
				System.out.println("파일 읽기 실패");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
