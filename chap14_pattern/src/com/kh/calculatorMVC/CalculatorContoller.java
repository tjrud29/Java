package com.kh.calculatorMVC;

public class CalculatorContoller {
	private CalculatorModel Model;
	private CalculatorModel view;
	
	public void CalculatorController(CalculatorModel Model, CalculatorModel view) {
		this.view = view;
		this.Model = Model;
	}
	
	
	public void run() {
		int userInput = view.getuserInput();
		Model.setNumber(userInput);
	}
}
