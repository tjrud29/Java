package com.kh.example.practice1.model.vo;

public class Member {
	String memberid;
	String memberpwd;
	String membername;
	int age;
	char gender;
	String phone;
	String email;
	
	
	public Member(String memberid,String memberpwd,
			String membername,int age,char gender,String phone,String email ) {

		this.memberid  = memberid;
		this.memberpwd = memberpwd;
		this.membername = membername;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	
	}
	
		public void people() {
			System.out.println(memberid);
			System.out.println(memberpwd);
			System.out.println(membername);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(phone);
			System.out.println(email);
				
		}
		
}
		
		
		

