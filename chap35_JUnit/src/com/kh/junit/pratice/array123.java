package com.kh.junit.pratice;

public class array123 {

private int[] arr;
	
	public array123(int size) {
		arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
	}
	public int[] getArray() {
		return arr;
	}
	
}
