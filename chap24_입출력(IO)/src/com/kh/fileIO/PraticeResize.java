package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PraticeResize {

	public static void main(String[] args) {
		//이미지 하나 불러오기
		//바탕화면에 새로운 폴더 만들기
		//새로 리사이즈한 이미지
	
	
	}
	public void pratice1() {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "hamham.jpg";
		String outpImg = path + "reSizehamham.jpg";
		
		int width = 300;
		int height = 150;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈중 오류 on" + e.getMessage());
		}
	}

}
