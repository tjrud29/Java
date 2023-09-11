package com.kh.goodExam.game;
//랜덤 숫자맞추기 게임 모델
public class GameModel {
	//숫자 맞추기
	private int secretNumber;//숨겨진 번호
	private int attempts;//시도 몇 번?
	
	public GameModel() {
		//1~100 사이의 무작위 숫자 생성하기
		secretNumber = (int)(Math.random() * 100) + 1;
		attempts = 0;
	}
	public int getStcretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int Guess) {
		incrementApttempts();
		return Guess == secretNumber;
	}
}
