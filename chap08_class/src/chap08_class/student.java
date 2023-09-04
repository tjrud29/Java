package chap08_class;

public class student {
//1.멤버변수(학생의 속성)
	String name;
	int age;
	String grade;
	
	
/*********** 생성자 도 메서드 의 일부 ***************/
	//학생임을 선언할 것이다. 이름 나이 학년
	public student(String name, int age, String grade) {	
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//학생 정보 출력 메서드 
	//학생들의 정보를 출력할 것이다.
	public void displayInfo() {
		System.out.println("학생 이름" + name);
		System.out.println("나이" + age);
		System.out.println("학년" + grade);
	}

	
	
}
