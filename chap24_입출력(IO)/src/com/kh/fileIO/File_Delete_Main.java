package com.kh.fileIO;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "img.jpg";
		
		//파일 객체 생성
		File fileToDelete = new File(originFile);
		
		//파일 삭제
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("파일이 성공적으로 삭제됨");
		}else {
			System.out.println("파일이 삭제 안됨");
		}
	}
 
}
