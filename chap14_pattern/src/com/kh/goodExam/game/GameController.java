package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model ,GameView view ) {
		this.model = model;
		this.view = view;
	}
	public void runGame() {
		
		view.displayMessage();
		
		Scanner sc = new Scanner(System.in);
		
		view.displayGuessPromt();
		int guess = sc.nextInt();
		
		view.displayCorrectGuess();
		
		view.displayInCorrectGuess();
		
		view.displayAttempts(model.getAttempts());
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}
