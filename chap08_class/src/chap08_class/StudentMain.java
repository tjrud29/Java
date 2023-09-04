package chap08_class;

public class StudentMain {

	public static void main(String[] args) {
		//학생의 객체 생성
		student student1 = new student("kh학생", 20, "1학년");
		//학생 정보 출력
		student1.displayInfo();
		
		
		//학생 3명 만들어서 3명의 이름과 나이와 학력을 displayInfo();를 이용해서 출력
		
	}

}
