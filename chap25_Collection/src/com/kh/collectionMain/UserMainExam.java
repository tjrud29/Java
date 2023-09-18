package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		//HashMap 생성 UserAge
		Map <String, Integer> player = new HashMap<>();
		
		
		//유저의 이름과 나이
		player.put("가좌",332);
		player.put("나나123",32);
		player.put("사랑사랑123321",32);
		player.put("안녕안녕",23);
		//특정 유저 검색
		String playerName = "안녕안녕";
		
		//모든 학생과 성적 출력
		if(player.containsKey(playerName)) {
			int playerID = player.get(playerName);
			System.out.println(playerName + "의 유저아이디는" + playerID + "입니다.");
		}else {
			System.out.println("유저를 찾을수 없습니다.");
		}
		//유저 나이 수정
		String playerIDUpdate = "혜정혜정";
		int newPlayerID = 2910;
		player.put(playerIDUpdate,newPlayerID);
		System.out.println(newPlayerID +playerIDUpdate);
		//유저 탈퇴
		String removePlayer = "나나123";
		player.remove(removePlayer);
		System.out.println(removePlayer + "플레이어를 삭제함");
		//최종 유저 이름 나이 출력
		
	}

}
