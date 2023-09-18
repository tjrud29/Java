package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap 생성
		Map<String,Integer> studentGrades = new HashMap<>();
		
		//학생과 점수를 추가하겠습니다
		studentGrades.put("KH" , 95);
		studentGrades.put("park", 39);
		studentGrades.put("fdaf", 32);
	
		//특정 학생의 성적 검색
		//Map containsKey : 맵에서 key value 값이 있는지 확인 
		String studentName = "bob";
		//만약에 학생들 중에서 bob 있다면 성적을 보여줘
		if(studentGrades.containsKey(studentName)) {
			
			
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "성적은 " + grade);
			
		}else
			System.out.println(studentName + "성적을 찾을수 없음");
		
		//모든 학생과 성적을 출력
		for(Map.Entry<String, Integer> entry :studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
					System.out.println(name + ":" + grade);
					
		}
		
		//학생 성적 수정
		String StudentUpdate = "BOb";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(newGrade + StudentUpdate);
		
		//학생 제거
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "의 성적을 삭제했습니다.");
		
		//최종 학생 성적 출력
		
			
		}
		
		
			
		
		

	}


