package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class fasdfsda {

	public static void main(String[] args) {
		// ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
	//	1~�Է°� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�");
		int num = sc.nextInt();
		
		int[] arr = new int[num];//5�� ������ 01234 arr[5] = 4
		//5�� ������ 12345�� ���;���
		for(int i = 0; i < num ;i++) {
			arr[i] = i +1;
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
	}

}
