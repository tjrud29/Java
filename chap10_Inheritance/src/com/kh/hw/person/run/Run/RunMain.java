package com.kh.hw.person.run.Run;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name1 = sc.next();
		System.out.println("나이 입력");
		int age1 = sc.nextInt();
		System.out.println("키 입력");
		int height1 = sc.nextInt();
		System.out.println("몸무게 입력");
		int weight1 = sc.nextInt();
		
		Student mystudent = new Student(name1, age1, height1, weight1);
		mystudent.info();
	}
}
