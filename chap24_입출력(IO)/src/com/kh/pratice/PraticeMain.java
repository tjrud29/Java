package com.kh.pratice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PraticeMain {

	public static void main(String[] args) {
		PraticeMain pm = new PraticeMain();
		pm.pratice1();
	}
	public void pratice1() {
		//경로 설정해서 파일 만들기
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\Users\\user1\\Desktop//ㅇㅇ.txt");
			//파일 쓰기
			writer.write("안녕");
			//파일 닫기
			writer.close();
			
			//어디서 보던지 경로가 확실한 경로(절대경로)
			FileReader reader = new FileReader("C:\\\\Users\\\\user1\\\\Desktop//ㅇㅇ.txt");
			BufferedReader bufferd = new BufferedReader(reader);
			
			String line;
			while((line = bufferd.readLine())!=null) {
				System.out.println(line);
			}
			bufferd.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
