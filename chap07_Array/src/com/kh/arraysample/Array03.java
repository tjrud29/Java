package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
			/*
			  ���ڿ��� �Է� �޾� ���� �ϳ� �ϳ� �迭�� �ְ� �˻��� ���ڰ�
			  ���ڿ��� � �� �ִ��� ������
			  �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			  
			  
			  1.���ڿ��� �Է�
			  2.���ڿ��� ���� ����
			  3.�ش� ���ڰ� ���ڿ��� �� ��° ����
			 * */

			Scanner sc = new Scanner(System.in);
			
			System.out.println("���ڿ��� �Է��ϼ���");
			String inputString = sc.next();//���ڿ�
			
			System.out.println("�˻� �� ���ڸ� �Է��ϼ���");
			char searchChar = sc.next().charAt(0);//���� �ϳ��� �Է¹���
			
			char[] charString = inputString.toCharArray();	//toCharArray >>���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
			//String�� char�� �ٲ���
			//���ڿ��� ���ڷ� ��ȯ
			//String >> char
			//�ȳ��ϼ��� >> '��', '��' ,'��', '��', '��'
			//�˻� �� ���ڰ� ���ڿ��� �� �� �� �ִ��� ����
			//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� 
			
			int charCount = charString.length;
			System.out.println("���ڿ� ����  :" + charString.length );
			
			
			
			
				
	}

}
